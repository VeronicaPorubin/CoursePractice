package Lesson9.HomeWork;

import java.util.Scanner;

public class AreaMain {
    public static void main(String[] args) {

        double width;
        double length;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle: ");
        length = scanner.nextDouble();
        System.out.println("Enter the width of Rectangle: ");
        width = scanner.nextDouble();
        Area rectangle = new Area();
        rectangle.setDim(length, width);
        System.out.println("The area: " + rectangle.getArea());


    }
}
