package com.homework.lesson19;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NumberOfDays {

    public static void totalDaysBetween (){
        LocalDate myBirthday = LocalDate.of(1994, 9, 14 );
        LocalDate timeNow = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(myBirthday, timeNow);
        System.out.println("I was born  " + daysBetween + "  days ago!");
    }
}
