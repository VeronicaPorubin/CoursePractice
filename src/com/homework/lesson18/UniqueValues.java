package com.homework.lesson18;

import java.util.HashSet;
import java.util.Set;

public class UniqueValues {

    public static void stringValues() {
        System.out.println("Uniques Zodiacs Signs: ");
        Set<String> set = new HashSet<>();
        set.add("Virgo");
        set.add("Libre");
        set.add("Leo");
        set.add("Gemini");
        set.add("Libre");
        set.add("Scorpio");
        set.add("Cancer");
        set.add("Capricorne");
        set.add("Aquarius");
        set.add("Pisces");
        set.add("Taurus");
        set.add("Cancer");

        for (String str : set) {

            System.out.println(str);
        }
    }
}
