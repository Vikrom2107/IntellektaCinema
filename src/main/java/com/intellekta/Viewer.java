package com.intellekta;

import java.util.List;

public class Viewer {
    private String nickname;
    private int age;
    private int amountCinemas;
    private List<Cinema> cinemas;

    public Viewer(String nickname, int age, int amountCinemas, List<Cinema> cinemas) {
        this.nickname = nickname;
        this.age = age;
        this.amountCinemas = cinemas.size();
        this.cinemas = cinemas;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAmountCinemas() {
        return amountCinemas;
    }

    public void addViewedCinema(Cinema cinema) {
        cinemas.add(cinema);
        amountCinemas = cinemas.size();
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }
}
