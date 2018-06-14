package com.la.movie.day.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sessions")
@Getter
@Setter
@NoArgsConstructor
public class MovieSession implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cinema_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Cinema cinema;

    @NotBlank
    private String hall;

    @NotBlank
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Movie movie;

    @NotBlank
    private String language;

    @NotBlank
    private Integer ticketPrice;

    @NotBlank
    private String dimension;
}

