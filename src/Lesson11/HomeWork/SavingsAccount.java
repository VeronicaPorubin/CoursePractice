package Lesson11.HomeWork;

public class SavingsAccount {
    public static double annualIntrestRate;
    private double savingsBalance;
    private static double monthlyInterest;

    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }


    public double calculateMonthlyInterest() {
       return monthlyInterest = savingsBalance + savingsBalance * annualIntrestRate / 12;



    }
    public static void modifyInterestRate(double interesRate){
        annualIntrestRate = interesRate/100;
    }



}
