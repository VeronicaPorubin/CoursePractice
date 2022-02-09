package TestingForMe;

import java.util.Scanner;

public class reversForMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbers, reversed = 0;
        System.out.println("Imput positive number: ");
        numbers = scanner.nextInt();
        for (; numbers != 0; numbers = numbers / 10) {

            int remainder = numbers % 10;
            reversed = reversed * 10 + remainder;

        }
        System.out.println("The reverse of the given number is: " + reversed);
    }
}