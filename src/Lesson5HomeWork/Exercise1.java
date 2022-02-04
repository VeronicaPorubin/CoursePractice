package Lesson5HomeWork;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }


    }
}
