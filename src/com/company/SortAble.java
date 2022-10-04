package com.company;

import java.util.List;

public interface SortAble {

    void sortByMoviesName(List<Movie> movies);

    void sortByYear(List<Movie> movies);

    void sortByDirectorName(List<Movie> movies);

    void sortByActorName(List<Movie> movies);
}
