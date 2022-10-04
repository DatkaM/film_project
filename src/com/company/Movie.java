package com.company;

import java.util.List;

public class Movie {

    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> list;

    public Movie(String name, int year, String description, Director director, List<Cast> list) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.list = list;
    }

    public Movie() {
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public String getDescription() {
        return this.description;
    }

    public Director getDirector() {
        return this.director;
    }

    public List<Cast> getList() {
        return this.list;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setList(List<Cast> list) {
        this.list = list;
    }



    public String toString() {
        return "Movie(name=" + this.getName() + ", year=" + this.getYear() + ", description=" + this.getDescription() + ", director=" + this.getDirector() + ", list=" + this.getList() + ")";
    }
}
