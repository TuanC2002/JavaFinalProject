package com.example.finalProject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.bson.types.ObjectId;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movies {
    @Id
    public ObjectId _id;
    private String imdbId;
    private  String title;
    private String releaseDate;
    private String linkTrailer;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference

    private List<Review> reviewId;
}
