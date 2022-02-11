package unit_8.examples;

import java.util.Arrays;

public class TwoDArrays {
    public static void main(String[] args) {
        // Three initialized 1D arrays

        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr3 = {3, 6, 9, 12, 15};
        int[] arr4 = {4, 8, 12, 16, 20};

        // 1. Create a 2D array called arr2D with arr2, arr3, and arr4

        //int[][] arr2D = {{2, 4, 6, 8, 10}, {3, 6, 9, 12, 15}, {4, 8, 12, 16, 20}};
        int[][] arr2D = {arr2, arr3, arr4};

        // 2. Create an int called last and save the last value of the first row
        //    in arr2D in this variable.  Print this value

        int last = arr2D[0][arr2D[0].length - 1];
        System.out.println(last);
        System.out.println();

        // 3.  Print the middle value of arr2D

        System.out.println(Arrays.toString(arr2D[1]));

        // 4.  Change the first value in the last row of arr2D to be equal to 0
        //     and then print its new value

        System.out.println();
        System.out.println(arr2D[2][0]);
        arr2D[2][0] = 0;
        System.out.println(arr2D[2][0]);
        System.out.println();

        // BONUS challenge - see if you can figure out the way to use double for loops to
        // traverse a 2D array

        // Write a double loop to print all the values of the array arr2D.
        // Each row of the array should print on a new line

        for (int i = 0; i < arr2D.length; i++) {
            System.out.println();
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + "\t");
            }
        }
        System.out.println();
        System.out.println();

//        for(int[] ints: arr2D){
//            System.out.println();
//            for(int aInt: ints){
//                System.out.print(aInt + "\t");
//            }
//        }

        // Create a 5 x 10 2D array called multiples

        int[][] multiples = new int[5][10];

        /* Fill the multiples array using a for loop so that the values look like:
            2 4  6  8 10 12 14 16 18 20
            3 6  9 12 15 18 21 24 27 30
            4 8 12 16 20 24 28 32 36 40
            ..
            6 12 ...                 60
        */


        for (int i = 0; i < multiples.length; i++) {
            for (int j = 0; j < multiples[i].length; j++) {
                multiples[i][j] = (i + 2) + (j*(i+2));
            }
        }

        // Print all values in multiples using a for loop
        for(int[] ints : multiples){
            System.out.println();
            for(int aInt : ints){
                System.out.print(aInt + "\t");
            }
        }

    }
}
