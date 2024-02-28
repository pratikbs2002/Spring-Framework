package com.example.sport;

public class Student {
    private int id;
    private String name;
    private Sport sport;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", sport=" + sport + "]";
    }
}
