package Lesson12.HomeWork;

import java.util.Scanner;

public class PrintNumberMain {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isPrimer = primeNumber.isPrime(num);



        if (isPrimer) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        System.out.println("-----------------------------------------------------------------");

         String primeNum = String.valueOf(primeNumber.primeNumbers());
        System.out.println("Prime numbers from 1 to 10000 are :");
        System.out.println(primeNum);

    }


}




