package Lesson8.HomeWork;
/**
 * Make a Java program that would calculate the sum, average, the number of even
 * and odd elements of an one-dimensional array and a two-dimensional array of type
 * int.
 */
public class CalculateArray {
    public static void main(String[] args) {

        int[] oneArray = {0, 3, 6, 9, 12, 15, 18, 21, 24};
        int[][] twoArray = {{0, 6, 18, 92, 43, 3}, {12, 78, 45, 21, 76}};

        oneDimensionalArray(oneArray);
        twoDimensionalArray(twoArray);
    }

    static void oneDimensionalArray(int[] oneArray) {
        int sum = 0;
        double average;
        for (int i = 0; i < oneArray.length; i++) {
            sum += oneArray[i];
        }
        System.out.println("The sum is: " + sum);

        average = sum / oneArray.length;
        System.out.println("Average value of the array elements is: " + average);

        System.out.println("The number of odd: ");
        for (int i = 0; i < oneArray.length; i++) {
            if (oneArray[i] % 2 != 0) {
                System.out.print(oneArray[i] + " ");
            }
        }
        System.out.println();
        System.out.println("The number of even: ");
        for (int i = 0; i < oneArray.length; i++) {
            if (oneArray[i] % 2 == 0) {
                System.out.print(oneArray[i] + " ");
            }
        }
    }

    static void twoDimensionalArray(int[][] twoArray) {
        int sum = 0;
        double average;
        for (int[] array : twoArray) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        }
        System.out.println();
        System.out.println("The sum is: " + sum);

        average = sum / twoArray.length;
        System.out.println("Average value of the array elements is: " + average);

        System.out.println("The number of odd: ");
        for (int[] array : twoArray) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    System.out.print(array[i] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("The number of even: ");
        for (int[] array : twoArray) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    System.out.print(array[i] + " ");
                }
            }
        }

    }
}
