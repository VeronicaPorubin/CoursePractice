package Lesson12.HomeWork;

public class PrimeNumber {


    public boolean isPrime(int num) {

       if (num <= 1) {
          return false;
      }
       for (int i = 2; i <  Math.sqrt(num); i++) {
          if (num % i == 0) {
              return false;
          }
      }
      return true;
   }


    public String primeNumbers() {
        int number=0;
        String primeNum = " ";
        for ( int i = 1; i <= 10000; i++) {
            int counter = 0;
            for (number = i; number >= 1; number--) {
                if (i % number == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNum = primeNum + i + " ";
            }
        }
        return primeNum;
    }
}




