package Lesson11.HomeWork;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);

        SavingsAccount.modifyInterestRate (4);

        System.out.println( "New Balance for Saver1: " + saver1.calculateMonthlyInterest() + "$");
        System.out.println( "New Balance for Saver2: " + saver2.calculateMonthlyInterest() + "$");

        SavingsAccount.modifyInterestRate (5);

        System.out.println("New Balance for Saver1: " + saver1.calculateMonthlyInterest());
        System.out.println("New Balance for Saver2: " + saver2.calculateMonthlyInterest());
    }
}
