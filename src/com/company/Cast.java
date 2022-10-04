package com.company;

public class Cast {
    private String actor;
    private String role;

    public Cast(String actor, String role) {
        this.actor = actor;
        this.role = role;
    }

    public String getActor() {
        return this.actor;
    }

    public String getRole() {
        return this.role;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public String toString() {
        return "Cast(actor=" + this.getActor() + ", role=" + this.getRole() + ")";
    }
}
