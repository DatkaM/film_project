package com.company;

import java.util.List;

public interface FindAble {

    void findMovieByName(List<Movie> movies);

    void findMovieByYear(List<Movie> movies);

    void findMovieByActorName(List<Movie> movies);

    void findMovieByDirectorName(List<Movie> movies);

    void findMovieByRole(List<Movie> movies);

    void findMovieByDescription(List<Movie> movies);

}
