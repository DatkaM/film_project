package com.company;

import java.util.Comparator;
import java.util.List;

public class ComparatorByActor implements Comparator<Movie>{


    @Override
    public int compare(Movie actorName1, Movie actorName2) {

        return actorName1.getList().get(0).getActor().compareTo(actorName2.getList().get(0).getRole());
    }
}
