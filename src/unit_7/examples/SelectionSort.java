package unit_7.examples;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] unsorted = {8246, 47, 100, -5, 82, 17, 22};

        System.out.println("Unsorted");
        for(int num : unsorted){
            System.out.println(num + " ");
        }

        System.out.println();

        selectionSortLH(unsorted);
        System.out.println("Low to High");
        for(int num : unsorted){
            System.out.println(num + " ");
        }
        System.out.println();


        selectionSortHL(unsorted);
        System.out.println("High to Low");
        for(int num : unsorted){
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public static int[] selectionSortLH(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){    // Controls index to insert the next smallest value
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){ // Iterates through all remaining indices after "i"
                if(arr[j] < arr[minIndex]){ // Test if you have found a smaller value
                    minIndex = j;
                }
            }
            // Need to swap index "i" and index "minIndex"
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static int[] selectionSortHL(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){    // Controls index to insert the next smallest value
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){ // Iterates through all remaining indices after "i"
                if(arr[j] > arr[minIndex]){ // Test if you have found a larger value
                    minIndex = j;
                }
            }
            // Need to swap index "i" and index "minIndex"
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
