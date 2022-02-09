package Lesson4HomeWork;

import java.util.Scanner;

public class MinuteConverter {
    public static void main (String args []) {

        Scanner time = new Scanner(System.in);
        System.out.print("Convert minutes into a number of years and days");
        long minutes = time.nextLong ();

        long days = (long) (minutes/60/24);
        long years = (long) (minutes/(60*24*365));
        time.close();

        System.out.println( minutes + " into a number " + years + " of years and " + days + " days ");





    }
}
