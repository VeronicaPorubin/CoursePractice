package Lesson7.HomeWork;


public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Print numbers : ");
        int numberPrint = 0;
        // For numbers from 100 to 1,000
        for (int number = 100; number <= 1000; number++) {
            // If number is divisible by 5 and 6
            if (number % 5 == 0 && number % 6 == 0) {
                System.out.print(number + " ");
                numberPrint++;
            }
            // If numbers per line is 10
            if (numberPrint == 10) {
                System.out.println();
                numberPrint = 0;
            }


        }


    }
}