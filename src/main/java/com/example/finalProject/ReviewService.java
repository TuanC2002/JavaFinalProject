package com.example.finalProject;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    public ReviewRepository reviewRepository;
    private MongoTemplate mongoTemplate;
    public Review createRiew(String reviewbody, String imdbid){
        Review review = new Review(reviewbody);
        reviewRepository.insert(review);
        mongoTemplate.update(Movies.class)
                .matching(Criteria.where("imdbid").is(imdbid))
                .apply(new Update().push("reviewIds").value(review))
                .first();
        return review;
    }
}
