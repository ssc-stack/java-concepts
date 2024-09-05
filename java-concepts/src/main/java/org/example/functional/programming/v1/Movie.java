package org.example.functional.programming.v1;

import lombok.Data;

@Data
public class Movie {
    private int id;
    private String name;
    private int rating;

    public Movie(int id, String name, int rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

}
