package com.intellekta;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = new ArrayList<>();
        viewers.add(new Viewer("John", 20, 0));
        viewers.add(new Viewer("Sara", 11, 0));
        viewers.add(new Viewer("Mary", 36, 5));
        viewers.add(new Viewer("Nick", 13, 4));
        viewers.add(new Viewer("Carl", 54, 2));
        viewers.add(new Viewer("Mia", 42, 7));

        System.out.println(ViewerStatistics.averageAge(viewers));
    }
}