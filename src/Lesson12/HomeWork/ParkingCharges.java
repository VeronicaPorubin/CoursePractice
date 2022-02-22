package Lesson12.HomeWork;

import java.util.Scanner;

public class ParkingCharges {
    double minFee= 2.0;
    double maxFee= 10.0;
    double maxHours= 24.0;
    double minHours= 3.0;
    double hourEx= 0.5;
    private double totalRecepits;
    public double hours;
    private double fee;

    public double getTotalRecepits (){
        return totalRecepits;
    }
    public double ParkedHours(){
        return hours;
    }
public double ClientCharge(){
        return fee;
}
    public double getcalculateCharge(double hours)
    {

        double fee;

        fee= minFee;

        if ( hours <= minHours )
            fee = minFee;

        else if ( hours > minHours && hours < maxHours )
            fee = hourEx*((hours) - minHours) + minFee;

        else if ( hours == maxHours )
            fee = maxFee;
        return fee;

    }
}
