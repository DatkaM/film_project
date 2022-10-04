package com.company;

import java.util.Comparator;

public class ComparatorByDirector implements Comparator <Movie>{

    @Override
    public int compare(Movie director1, Movie director2) {
        return director1.getDirector().getFirstName().compareTo(director2.getDirector().getFirstName());
    }
}
