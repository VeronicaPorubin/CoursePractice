package Lesson7.HomeWork;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //use scanner
        Scanner scanner = new Scanner(System.in);

        int sum;
        char operant;
        //use do
        do {
            System.out.println("Enter two numbers: ");
            // Perform a scanner to display two numbers
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            // sum will be printed in the console according to the formula
            sum = num1 + num2;
            System.out.println("Sum is " + sum);

            System.out.println("Do you wish to perform the operation again, Y/N? ");
            //Perform a scanner to display num
            operant =scanner.next().charAt(0);
        } while (operant == 'Y' && operant == 'N');


    }
}
