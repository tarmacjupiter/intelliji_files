package unit_7.in_class;


import java.util.ArrayList;
import java.util.Collections;

/**
 * In this java file we will explore these key algorithms with ArrayLists
 * Determine a minimum or maximum value
 * Compute a sum, average, or mode
 * Determine if at least one element has a particular property
 * Determine if all elements have a particular property
 * Access all consecutive pairs of elements
 * Determine the presence or absence of duplicate elements
 * Determine the number of elements meeting specific criteria
 * (already did this last lesson with evens)
 * Shift or rotate elements left or right
 * Reverse the order of the elements
 */
public class ArrayListsAlgor {
    public static void main(String[] args) {
        // Define ArrayLists to be used for testing the methods
        ArrayList<Integer> numsNoRepeats = new ArrayList<>();
        numsNoRepeats.add(2);
        numsNoRepeats.add(5);
        numsNoRepeats.add(3);
        numsNoRepeats.add(8);
        numsNoRepeats.add(9);
        numsNoRepeats.add(1);


        ArrayList<Integer> numsRepeats = new ArrayList<>();
        numsRepeats.add(2);
        numsRepeats.add(5);
        numsRepeats.add(1);
        numsRepeats.add(2);
        numsRepeats.add(6);
        numsRepeats.add(8);


        ArrayList<Integer> orderedNums = new ArrayList<>();
        orderedNums.add(2);
        orderedNums.add(3);
        orderedNums.add(8);
        orderedNums.add(11);
        orderedNums.add(15);
        orderedNums.add(19);


        ArrayList<String> names = new ArrayList<>();
        names.add("Mya");
        names.add("John");
        names.add("Kim");
        names.add("Sanjana");
        names.add("Adi");
        names.add("Noah");
        names.add("Anthony");
    }

    /**
     * Finds the smallest value in the ArrayList
     * @param list ArrayList of Integers
     * @return returns its int value
     */
    public static int findMin(ArrayList<Integer> list) {
        int min = list.get(0);

        for (Integer integer : list) {
            if (integer < min) {
                min = integer;
            }
        }
        return min;
    }

    /**
     * Finds the largest value in the ArrayList
     * @param list ArrayList of Integers
     * @return returns its int value
     */
    public static int findMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for(Integer tempInt : list){
            if(tempInt > max){
                max = tempInt;
            }
        }
        return max;
    }

    /**
     * Finds the sum of all values in the ArrayList
     * @param list ArrayList of Integers
     * @return returns the int value for the sum
     */
    public static int findSum(ArrayList<Integer> list) {
        int sum = 0;
        for(Integer tempInt : list){
            sum += tempInt;
        }
        return sum;
    }

    /**
     * Finds the average as a double of all Integer values
     * @param list ArrayList of Integers
     * @return double average value
     */
    public static double findAverage(ArrayList<Integer> list) {
        int sum = 0;
        double count = 0;
        for(Integer tempInt : list){
            sum += tempInt;
            count++;
        }

        return sum / count;
    }

    /**
     * Determines if all values are in increasing order
     * @param list ArrayList of Integers
     * @return true or false if increasing
     */
    public static boolean isIncreasing(ArrayList<Integer> list) {
        for(int i = list.size() - 1; i > 0; i--){
            if(list.get(i) < list.get(i - 1)){
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if any values within the ArrayList are repeated anywhere else
     * in the ArrayList
     * @param list ArrayList of Strings
     * @return true if any values are repeated, false otherwise
     */
    public static boolean hasDuplicates(ArrayList<String> list) {
        Collections.sort(list);
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i).equals(list.get(i + 1))){
                return true;
            }
        }
        return false;
    }

    /**
     * Creates a new ArrayList of Strings that is equal to the original ArrayList
     * in reverse order.  Original ArrayList is unchanged.
     * @param list ArrayList of Strings
     * @return new ArrayList of Strings in reverse order
     */
    public static ArrayList<String> revArrayList(ArrayList<String> list) {
        ArrayList<String> temp = new ArrayList<String>();

        for(int i = list.size() - 1; i >= 0; i--){
            temp.add(list.get(i));
        }

        return temp;
    }

    /**
     * Shifts all values in list to the Left and the value at index 0 is moved
     * to index list.size() - 1.
     * @param list ArrayList of Strings
     */
    public static void shiftLeft(ArrayList<String> list) {
        String lastName = list.get(list.size() - 1);

        for(int i = list.size() - 1; i > 0; i--){
            list.set(i, list.get(i - 1));
        }

        list.set(0, lastName);

        System.out.println(list);
}
}
