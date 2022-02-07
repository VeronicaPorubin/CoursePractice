package com.homework.lesson6;

public class PrintNumbersFrom1to10 {
    public static void main(String[] args) {

        printNumbers();

    }

    public static void printNumbers() {
        // Use the loop for print numbers on the decrease
        System.out.println("Print numbers 10 to 0 : ");
        for (int number = 10; number >= 0; number--) {
            System.out.println(number);
        }
        // Use the loop for print numbers on the increase
        System.out.println("Print numbers 1 to 10 : ");
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }
    }
}

