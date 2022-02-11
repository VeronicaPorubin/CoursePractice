package Lesson8.HomeWork;
/**
 *Write a Java program to test if an array contains a specific value.
 */

public class SpecificValueArray {
    public static void main(String[] args) {
        int[] numArray = {345, 854, 235, 934, 694, 124, 597, 805, 851, 358, 672};
        int specificValue = 597;
        boolean test = false;

        for (int n : numArray) {
            if (n == specificValue){
                test = true;
                break;
            }
        }
        System.out.println( "The program found specific value: " + specificValue);

        }

    }