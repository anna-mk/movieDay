package com.la.movie.day.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class MovieInfo implements Serializable {

    private Long id;
    private String name;
    private String director;
    private String writers;
    private String stars;
    private String released;
    private String description;
    private String genre;
    private String duration;
    private String posterUrl;
    private String trailerUrl;

}
