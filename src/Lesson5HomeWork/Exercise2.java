package Lesson5HomeWork;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_zh_TW;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        int width1, lenght1, area1;
        int width2, lenght2, area2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width1 of Rectangle: ");
        width1 = scanner.nextInt();
        System.out.print("Enter the length1 of Rectangle: ");
        lenght1 = scanner.nextInt();
        System.out.print("Enter the width2 of Rectangle: ");
        width2 = scanner.nextInt();
        System.out.print("Enter the length2 of Rectangle: ");
        lenght2 = scanner.nextInt();

        area1 = (width1 * lenght1);
        System.out.println("Area1 of rectangle is: " + area1);
        area2 = (width2 * lenght2);
        System.out.println("Area2 of rectangle is: " + area2);

        if (area1 > area2){
            System.out.print("area1 ("+ area1 +") is greater than area2 ("+ area2 +")");
        } else {
            System.out.print("area2 ("+ area2 +") is greater than area1 ("+ area1 +")");
        }




    }
}
