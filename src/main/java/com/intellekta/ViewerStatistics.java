package com.intellekta;

import java.util.List;

public class ViewerStatistics {

    public static double averageAge(List<Viewer> viewers) {
        int allAges = 0;
        for (Viewer viewer : viewers) {
            allAges += viewer.getAge();
        }
        double averageAge = allAges/(double) viewers.size();
        double scale = Math.pow(10, 2);
        return Math.ceil(averageAge * scale) / scale;
    }
}
