package unit_7.in_class;

import java.util.ArrayList;

public class BinarySearching {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(9);
        nums.add(11);
        nums.add(14);
        nums.add(17);
        nums.add(24);

        System.out.println(binarySearch(nums, 14));
        System.out.println(binarySearch(nums, 34));

    }

    public static int binarySearch(ArrayList<Integer> list, int num) {
        int low = 0, high = list.size()-1;
        int middle = (low + high)/2;

        while (list.get(middle) != num && low <= high)
        {
            if (num < list.get(middle)) {
                high = middle - 1;            // remove upper half
            }
            else{
                low = middle + 1;            // remove lower half
            }
            middle = (high + low)/2;  			// recalculate new middle
        }

        if (list.get(middle).equals(num)) {
            return middle;  // value is found
        }
        else {
            return -1;  // value is not found
        }
    }
}
