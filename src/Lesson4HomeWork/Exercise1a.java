package Lesson4HomeWork;

import java.io.PrintStream;

public class Exercise1a {
    public static void main(String[] args) {
        //a.
        System.out.print("Current World Population - ");
        long CurrentWorldPopulation = Long.parseLong("7811080815");
        System.out.println(CurrentWorldPopulation);
        //b.
        System.out.print("Cars Produced This Year - ");
        int CarsProducedThisYear = Integer.parseInt("55235358");
        System.out.println(CarsProducedThisYear);
        String words = "Cars Produced This Year";
        String message = (words + " " + "-" + 55235358);
        //c.
        System.out.print ("First Letter In Alphabet - ");
        char FirstLetterInAlphabet = 'A';
        System.out.println(FirstLetterInAlphabet);
        //d.
        String text1 = "Java Is Amazing - ";
        boolean  text2= true;
        System.out.println (text1 + text2);
        //e.
        String a = "Pi - ";
        double c = 3.14159;
        System.out.print(a + c);
    }
}