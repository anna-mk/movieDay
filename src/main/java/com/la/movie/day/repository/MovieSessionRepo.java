package com.la.movie.day.repository;

import com.la.movie.day.domain.entity.MovieSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieSessionRepo extends JpaRepository<MovieSession, Long> {
}
