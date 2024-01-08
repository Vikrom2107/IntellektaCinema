package com.intellekta;

public class Cinema {
    private String name;
    private String genre;
    private double time;

    public Cinema(String name, String genre, double time) {
        this.name = name;
        this.genre = genre;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
