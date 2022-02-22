package Lesson12.HomeWork;

import java.util.Scanner;


public class ParkingChargersMain {
    public static void main(String[] args) {
        ParkingCharges parking = new ParkingCharges();

        Scanner input = new Scanner(System.in);

        double totalReceipts = parking.getTotalRecepits();
        double hours = parking.ParkedHours();
        double fee = parking.ClientCharge();

        System.out.println("Welcom in our Garage and Enter the Hours Parking:");
        hours = input.nextDouble();

        while (hours <= 24) {
            fee = parking.getcalculateCharge(hours);
            totalReceipts += fee;
            System.out.println("Current charge:" + fee + "$" + " Total receipts: " + totalReceipts + "$");
            System.out.print("Enter the Hours Parking: ");
            hours = input.nextDouble();
        }
        System.out.println("You have exceeded the access limit!");
    }
}
