package com.la.movie.day.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "movies")
@Getter
@Setter
@NoArgsConstructor
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String director;

    @NotBlank
    private String writers;

    @Column
    private String stars;

    @NotBlank
    private String released;

    @NotBlank
    private String description;

    @NotBlank
    private String genre;

    @NotBlank
    private String duration;

    @NotBlank
    private String posterUrl;

    @NotBlank
    private String trailerUrl;
}

