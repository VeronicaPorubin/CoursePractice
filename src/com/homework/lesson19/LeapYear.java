package com.homework.lesson19;

public class LeapYear {

    public static boolean printLeapYears(int year) {

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("Year " + year + " is a leap year");
        else
            System.out.println("Year " + year + " is not a leap year");

        return true;
    }
}
