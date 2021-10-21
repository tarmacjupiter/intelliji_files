package unit_4.homework;

import java.util.Scanner;

public class buildPhrase {
    public static void main(String[] args) {
        String str = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first word of your phrase (-1 to quit): ");

        String word = input.nextLine();

        while(word.equals("-1") == false){
            str += word + " ";
            System.out.println("Enter another word of your phrase (-1 to quit): ");
            word = input.nextLine();
        }
        System.out.println(str);
    }
}
