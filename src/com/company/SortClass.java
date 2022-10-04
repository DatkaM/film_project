package com.company;

import java.util.List;

public class SortClass implements SortAble{

    @Override
    public void sortByMoviesName(List<Movie> movies) {
        ComparatorByName comparatorByName = new ComparatorByName();
        movies.sort(comparatorByName);
        for(Movie m: movies){
            System.out.println("Movie: " + m.getName());
            System.out.println("Year: "+ m.getYear());
            System.out.println("Description: "+m.getDescription());
            System.out.println("Director: "+m.getDirector().getFirstName());

            for (Cast cast: m.getList()) {
                System.out.println("======> Cast <======");
                System.out.println("Actor's name: "+cast.getActor());
                System.out.println("Role: "+cast.getRole());
            }
        }
    }

    @Override
    public void sortByYear(List<Movie> movies) {
        ComparatorByYear comparatorByYear = new ComparatorByYear();
        movies.sort(comparatorByYear);
        for (Movie m:movies) {
            System.out.println("Year: "+m.getYear());
            System.out.println("Movie's name: "+m.getName());
            System.out.println("Description: "+ m.getDescription());
            System.out.println("Director: "+m.getDirector().getFirstName());
            for (Cast cast: m.getList()){
                System.out.println("======> Cast <======");
                System.out.println("Actor's name: "+cast.getActor());
                System.out.println("Role: "+cast.getRole());
            }
        }
    }

    @Override
    public void sortByDirectorName(List<Movie> movies) {
        ComparatorByDirector comparatorByDirector = new ComparatorByDirector();
        movies.sort(comparatorByDirector);
        for (Movie m:movies) {
            System.out.println("Director: "+m.getDirector().getFirstName());
            System.out.println("Movie's name: "+m.getName());
            System.out.println("Year: "+m.getYear());
            System.out.println("Description: "+m.getDescription());
            for(Cast cast: m.getList()){
                System.out.println("======> Cast <======");
                System.out.println("Actor's name: "+cast.getActor());
                System.out.println("Role: "+cast.getRole());
            }
        }
    }

    @Override
    public void sortByActorName(List<Movie> movies) {
        ComparatorByActor comparatorByActor = new ComparatorByActor();
        movies.sort(comparatorByActor);
        for(Movie m: movies){
            for (Cast cast : m.getList()) {
                System.out.println("======> Cast <======");
                System.out.println("Actor's name: " + cast.getActor());
                System.out.println("Role: "+ cast.getRole());
                System.out.println("Movie's name: "+m.getName());
                System.out.println("Year: "+m.getYear());
                System.out.println("Description: "+m.getDescription());
                System.out.println("Director: "+m.getDirector().getFirstName());
            }
        }
    }
}
