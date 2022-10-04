package com.company;

import java.util.Comparator;

public class ComparatorByYear implements Comparator<Movie> {

    @Override
    public int compare(Movie year1, Movie year2) {
        return year1.getYear() - year2.getYear();
    }
}
