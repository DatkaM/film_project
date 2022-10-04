package com.company;

public class Director {
    private String name;


    public Director(String firstName) {
        this.name = firstName;

    }

    public String getFirstName() {
        return this.name;
    }


    public void setFirstName(String firstName) {
        this.name = firstName;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                '}';
    }
}
