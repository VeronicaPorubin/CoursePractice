package Lesson4HomeWork;

import java.util.Scanner;

public class MinuteConverter {
    public static void main (String args []) {

        Scanner time = new Scanner(System.in);
        System.out.print("convert minutes into a number of years and days");
        long minutes = time.nextLong ();

        double days = (double) (minutes/60/24)%365;
        double years = (double) (minutes/(60*24*354));
        time.close();

        System.out.println((double) minutes + " into a number " + years + " of years and " + days + " days= ");





    }
}
