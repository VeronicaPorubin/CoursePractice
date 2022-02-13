package Lesson8.HomeWork;

public class CoppyElementsArray {
    public static void main(String[] args) {
        int[] array1 = {9, 6, 3, 8, 2, 5};
        int[] array2 = new int[array1.length];

        System.out.print("Elements of original array: ");
        for (int a = 0; a < array1.length; a++) {
            System.out.print(array1[a] + " ");
        }
        System.out.println();
        System.out.print ("Elements of coppy array: ");
        for (int b = 0; b < array2.length; b++) {
            System.out.print(array1[b] + " ");
        }
    }
}

