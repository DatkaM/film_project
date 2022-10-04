package com.company;

import java.util.List;
import java.util.Scanner;

public class FindClass implements FindAble{

    Scanner scanner = new Scanner(System.in);

    @Override
    public void findMovieByName(List<Movie> movies) {
        System.out.println("Write movie's name");
        String name = scanner.nextLine();
        for (Movie m : movies) {
            if(m.getName().equals(name)){
                System.out.println("Movie's name: " + m.getName());
                System.out.println("Year: " + m.getYear());
                System.out.println("Description: "+ m.getDescription());
                System.out.println("Director: "+m.getDirector().getFirstName());
                System.out.println("======> Cast <======");
                for(Cast cast: m.getList()){

                    System.out.println("Actor name: "+cast.getActor());
                    System.out.println("Role: "+cast.getRole());
                }

            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("Write movie's year");
        int year = scanner.nextInt();
        for (Movie m:movies) {
            if(m.getYear()==year){
                System.out.println("Year: "+ m.getYear());
                System.out.println("Movie's name: " + m.getName());
                System.out.println("Description: "+m.getDescription());
                System.out.println("Director: " + m.getDirector().getFirstName());
                System.out.println("======> Cast <======");
                for(Cast cast: m.getList()){

                    System.out.println("Actor name: "+cast.getActor());
                    System.out.println("Role: "+ cast.getRole());
                }
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        System.out.println("Write actor's name");
        String actorName = scanner.nextLine();
        for (Movie m : movies) {
            for (Cast c : m.getList()) {
                if (c.getActor().equals(actorName)) {

                    System.out.println("======> Cast <======");
                    System.out.println("Actor's name: " + c.getActor());
                    System.out.println("Role: " + c.getRole());
                    System.out.println("Movie's name: "+m.getName());
                    System.out.println("Year: " + m.getYear());
                    System.out.println("Description: "+m.getDescription());
                    System.out.println("Director: " + m.getDirector().getFirstName());
                }
            }
        }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    @Override
    public void findMovieByDirectorName(List<Movie> movies) {
        System.out.println("Write director's name");
        String directorName = scanner.nextLine();
        for(Movie m: movies){
            if(m.getDirector().getFirstName().equals(directorName)){
                System.out.println("Director: "+m.getDirector().getFirstName());
                System.out.println("Movie's name: "+m.getName());
                System.out.println("Year: "+m.getYear());
                System.out.println("Description: "+m.getDescription());

                System.out.println("======> Cast <======");
                for (Cast c:m.getList()) {

                    System.out.println("Actor's name: " +c.getActor());
                    System.out.println("Role: "+c.getRole());
                }
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        System.out.println("Write actor's role");
        String role = scanner.nextLine();
        System.out.println("======> Cast <======");
        for(Movie m:movies){
            for(Cast c: m.getList()){
                if(c.getRole().equals(role)){
                    System.out.println("Role: "+ c.getRole());
                    System.out.println("Actor's name: " + c.getActor());
                    System.out.println("Movie's name: "+m.getName());
                    System.out.println("Year: "+ m.getYear());
                    System.out.println("Description: "+m.getDescription());
                    System.out.println("Director: "+ m.getDirector().getFirstName());
                }
            }
        }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        System.out.println("Write movie's description");
        String description = scanner.nextLine();
        for(Movie m: movies) {
            if (m.getDescription().equals(description)) {
                System.out.println("Description: " + m.getDescription());
                System.out.println("Movie's name: " + m.getName());
                System.out.println("Year: " + m.getYear());
                System.out.println("Director: " + m.getDirector().getFirstName());
                System.out.println("=======> Cast <=======");
                for (Cast cast : m.getList()) {

                    System.out.println("Actor name: "+cast.getActor());
                    System.out.println("Role: "+cast.getRole());
                }
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}