package Lesson4HomeWork;

public class TaxCalculator {
    public static void main (String args []) {

        double price = 5.50;
        double tax = 1.25;
        int quantity = 20;
        double total = price * tax * quantity;
        System.out.print("Total cost with tax is: " + total);
    }
}
