package unit_7.examples;

public class InsertionSort {
    public static void main(String[] args) {
        int[] unsorted = {5, 8, 1, 2, 90, -5, 3, 0, 22};
        for(int i : unsorted){
            System.out.print(i + "\t");
        }

        System.out.println();


        int[] sorted = insertionSort(unsorted);
        for(int i : sorted){
            System.out.print(i + "\t");
        }
    }

    public static int[] insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){ // grabs the i'th index to insert in sub array
            int valueToInsert = arr[i];
            int position = i;
            while(position > 0 && valueToInsert < arr[position - 1]){ // While position is greater than 0, and while the value to insert is less than the value to the left of it
                arr[position] = arr[position - 1]; // "scooting" down (copying to the right)
                position--;
            }
            arr[position] = valueToInsert;
        }
        return arr;
    }
}
