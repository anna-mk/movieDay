package com.la.movie.day.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class MovieHeader implements Serializable {

    private Long id;
    private String name;
    private String poster_url;
    private String genre;
    private String nowUpcoming;
}
