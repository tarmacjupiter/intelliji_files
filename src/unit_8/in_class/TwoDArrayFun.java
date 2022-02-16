package unit_8.in_class;

import java.util.Arrays;

public class TwoDArrayFun {
    public static void main(String[] args) {
        // Initializer List #1
        int[][] twoDArray = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Initializer List #2
        String[] names1 = {"Rex Orange County", "Benny Sings"};
        String[] names2 = {"Luafey", "Bruno Major"};
        String[] names3 = {"Clairo", "Claire Rosinkranz"};

        String[][] allNames = {names1, names2, names3};

        print2DArrayString(allNames);
        System.out.println();

        // Declare, initialize, and fill a 2D array
        int[][] sums = new int[10][10];

        print2DArray(sums);
        for(int row = 0; row < sums.length; row++){
            for(int col = 0; col < sums[0].length; col++){
                sums[row][col] = row + col;
            }
        }
        System.out.println();
        print2DArray(sums);
        System.out.println();

        // More looping, can NOT FILL a 2D array using for-each loops 😔
        int[][] favNums = new int[2][2];
        for(int[] ints : favNums){
            System.out.println();
            for(int col : ints){
                System.out.print(col + " ");
            }
        }
        System.out.println();
        System.out.println();

        // Find average of each row in sums
        int sum = 0;
        int count = 0;
        for(int[] ints : sums){
            for(int i = 0; i < sums[0].length; i++){
                sum += ints[i];
                count++;
            }
        }
        double average = sum / count;
        System.out.println("The average of all the numbers is " + average);
    }

    public static void print2DArray(int[][] ints){
        for(int[] row : ints){                  // Traverse each row
            System.out.println();               // Have a break line after each row
            for(int col : row){                 // Traverse each column
                System.out.print(col + " ");    //Print out the column values
            }
        }
    }

    public static void print2DArrayString(String[][] strings){
        for(int row = 0; row < strings.length; row++){
            System.out.println();
            for(int col = 0; col < strings[0].length; col++){
                System.out.print(strings[row][col] + " ");
            }
        }
    }
}
