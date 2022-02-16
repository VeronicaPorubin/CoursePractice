package Lesson9.HomeWork;

import java.util.Scanner;

public class PinAccount {
    public static void main(String[] args) {

        correctPin();
    }

    public static void correctPin() {
        Scanner scanner = new Scanner(System.in);
        int inputCode;
        int count = 0;
        int pin = 1994;
        boolean verify = false;
        while (!verify) {
            System.out.print("Enter pin code: ");
            inputCode = scanner.nextInt();
            if (inputCode == pin) {
                System.out.println("Correct, welcome back!");
                verify = true;
                break;
            } else {
                System.out.println("Incorrect, try again!");
                count++;
            }
            if (count == 3) {
                System.out.println("Sorry but you have been locked out.");
                break;
            }
        }



    }
}
