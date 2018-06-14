package com.la.movie.day.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class MovieSessionDto implements Serializable {

    private Long id;
    private Long cinemaId;
    private String name;
    private Integer ticketPrice;
    private String hall;
    private Date date;

}
