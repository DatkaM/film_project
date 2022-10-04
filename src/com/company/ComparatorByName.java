package com.company;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Movie> {

    @Override
    public int compare(Movie name1, Movie name2) {
        return name1.getName().compareTo(name2.getName());
    }
}
