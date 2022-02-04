package Lesson5HomeWork;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value: ");
        double value = scanner.nextDouble();

        if (value > 0)
        {
            if (value < 1)
            {
                System.out.println("Positive small number");
            }
            else if (value > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        else if (value <0)
        {
            if (value > -1000000)
            {
                System.out.println("Negative small number");
            }
            else if (value < -1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }

    }
}
