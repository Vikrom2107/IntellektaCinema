package com.intellekta;

public class Viewer {
    private String nickname;
    private int age;
    private int amountCinemas;

    public Viewer(String nickname, int age, int amountCinemas) {
        this.nickname = nickname;
        this.age = age;
        this.amountCinemas = amountCinemas;
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

    public void setAmountCinemas(int amountCinemas) {
        this.amountCinemas = amountCinemas;
    }
}
