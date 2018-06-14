package com.la.movie.day.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class CinemaListDto implements Serializable {

    private Long id;
    private String name;
    private String address;
    private String phone;
    private String site_url;
    private String openClosed;

}
