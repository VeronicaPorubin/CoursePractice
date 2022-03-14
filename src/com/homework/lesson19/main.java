package com.homework.lesson19;

import com.homework.lesson18.Dictionary;
import com.homework.lesson18.Employee;
import com.homework.lesson18.UniqueValues;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int k;
            System.out.println();
            System.out.println("1. First exercise.");
            System.out.println("2. Second exercise.");
            System.out.println("3. Third exercise.");
            System.out.println("4. Exit!");
            k = scanner.nextInt();

            switch (k) {
                case 1:
                    PrintDataTime printDataTime = new PrintDataTime();
                    PrintDataTime.printDate();
                    PrintDataTime.printTime();
                    PrintDataTime.printDateTime(" ");
                    break;

                case 2:
                    LeapYear leapYear = new LeapYear();
                    int year = scanner.nextInt();
                    Boolean result = LeapYear.printLeapYears(year);
                    break;

                case 3:
                    NumberOfDays numberOfDays = new NumberOfDays();
                    NumberOfDays.totalDaysBetween();

                    break;
                case 4:
                    return;
                default:
                    System.out.println("You used the wrong option!");


            }
        }
    }
}