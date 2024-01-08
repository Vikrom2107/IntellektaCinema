package com.intellekta;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = new ArrayList<>();
        List<Cinema> cinemas = new ArrayList<>();
        cinemas.add(new Cinema("451", "Adventure", 1.5));
        viewers.add(new Viewer("John", 20, 0, cinemas));
        viewers.add(new Viewer("Sara", 11, 0, cinemas));
        viewers.add(new Viewer("Mary", 36, 5, cinemas));
        viewers.add(new Viewer("Nick", 13, 4, cinemas));
        viewers.add(new Viewer("Carl", 54, 2, cinemas));
        viewers.add(new Viewer("Mia", 42, 7, cinemas));

        System.out.println(ViewerStatistics.averageAge(viewers));
        System.out.println(cinemas.get(0).getGenre());
        System.out.println(viewers.get(2).getAmountCinemas());
    }
}