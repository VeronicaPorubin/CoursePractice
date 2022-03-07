package stock.management.data.util;

import java.util.Scanner;

public class ValidationInput {


    public double inputDouble(){
        double doubleInput= scanner.nextDouble();
        while (doubleInput<0) {
            System.out.println("The input should not be <0");
            doubleInput = scanner.nextDouble();
        }
        scanner.nextLine();
        return  doubleInput;
    }
    Scanner scanner;

    public ValidationInput() {
        scanner = new Scanner(System.in);
    }

    public int intInput() {
        int intInput = scanner.nextInt();
        while (intInput < 0) {
            System.out.println("The input should not be <0 ");
        }
        intInput = scanner.nextInt();
        return intInput;
    }

    public String inputString() {
        return scanner.nextLine();
    }
}
