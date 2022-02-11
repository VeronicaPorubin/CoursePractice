package TestingForMe;

import java.util.Scanner;

public class reversDoWhileMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int reversed = 0;
        System.out.println("Input positive number: ");
        number = scanner.nextInt();
        do {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number/10;

        } while (number != 0);
        System.out.println("The reverse of the given number is: " + reversed);
    }
}