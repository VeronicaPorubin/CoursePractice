package Lesson12.HomeWork;

public class PrimeNumber {


    public boolean isPrime() {
        int num = 0;
        if (num <= 0) {
            return false;
        }
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int primeNumbers() {
        int num=0;
        String primeNumbers = " ";
        for (int i = 1; i <= 10000; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        return num;
    }
}




