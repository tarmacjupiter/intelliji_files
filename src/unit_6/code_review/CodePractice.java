package unit_6.code_review;


import java.util.Arrays;

public class CodePractice {
    public static void main(String[] args) {
        // Initializer list
        int[] nums = {82, 47, 9247, 4782};
        String[] words;
        //words = {"Does", "this", "work?"}; // Does not work!

        //Fill the array below with the first 10 perfect squares
        int[] perfectsqaures = new int[10];

        for (int i = 0; i < perfectsqaures.length; i++) {
            perfectsqaures[i] = i * i;
        }

        //Write a for each loop to print values of perfect Squares
        for (int num : perfectsqaures) {
            System.out.println(num);
        }

        //String array
        String[] names = {"Nichols", "Denna", "Moon"};


        //Change the content of names to be ALL CAPITAL
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toUpperCase();
        }

        // Print out the names!
        for (String tempNames : names) {
            System.out.println(tempNames);
        }

        String[] lyrics = {"Oops", "I", "Did", "It", "Again"};
        // count the total number of letters in this array
        int count = 0;
        for (String lyric : lyrics) {
            count += lyric.length();
        }
//        for (int i = 0; i < lyrics.length; i++) {
//            count += lyrics[i].length();
//        }
        System.out.println(count);
    }
}
