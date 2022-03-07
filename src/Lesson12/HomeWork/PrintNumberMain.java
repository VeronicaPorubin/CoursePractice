package Lesson12.HomeWork;

import java.util.Scanner;

public class PrintNumberMain {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = primeNumber.isPrime();
        //int num = primeNumber.isPrime();

        if (isPrime) {
          //  System.out.println(num + " is a prime number.");
        } else {
          //  System.out.println(num + " is not a prime number.");
        }

        System.out.println("-----------------------------------------------------------------");

         int i = primeNumber.primeNumbers();
        System.out.println("Prime numbers from 1 to 10000 are :");
        System.out.println(i);

    }


}




