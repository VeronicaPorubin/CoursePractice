package Lesson7.HomeWork;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int reverse = 0;
        System.out.println ("Enter a positive integer: ");
        number= scanner.nextInt();
        while (number !=0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number /10;
        }
        System.out.println("The reverse is: " + reverse);



    }
}
