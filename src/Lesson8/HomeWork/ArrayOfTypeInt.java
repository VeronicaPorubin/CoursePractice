package Lesson8.HomeWork;
/**
 * Declare an array of type int. Allocate memory for this array and initialize it with
 * different numeric values. Display array elements on the console.
 */

public class ArrayOfTypeInt {
    public static void main(String[] args) {

        int [] intArray ; // declare an array

        intArray = new int[15];	// create an array of integers
        System.out.println("The output from this program is: ");

        // assign a value to each array element and print
        for (int i = 0; i < intArray.length; i++) {
           // if(intArray [i] %  3 ==0);{

           // }
            intArray[i] = i + 1;

            System.out.print(intArray[i] + " ");
        }

    }



}
