package unit_8.examples;

import java.util.Arrays;
import java.util.Scanner;

public class MorseCode {
    private static final String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
            ".--", "-..-", "-.--", "--.."};
    private static final String[] alphabet = { "a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x",
            "y", "z"};

    public static void main(String[] args) {
        boolean status = true;
        while(status){
            try {
                System.out.println("Pick a Number!\n\n");
                System.out.println("1. English to Morse");
                System.out.println("2. Morse to English");
                System.out.println("3. Quit\n\n");

                Scanner sb = new Scanner(System.in);
                int num = sb.nextInt();

                // Check num value
                if(num == 1){
                    printMorse();
                } else if(num == 2){
                    printEnglish();
                } else if(num == 3){
                    System.out.println("Goodbye");
                    status = false;
                } else {
                    System.out.println("Pick a valid number");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static String toMorse(String str, String[] alphabet, String[] morseCode){
        String[] strArr = str.split("");
        String result = "";
        for (String s : strArr) {
            if(s.equals(" ")){
                result += "/ ";
            } else {
                int index = Arrays.asList(alphabet).indexOf(s);
                result += morseCode[index] + " ";
            }
        }
        return result;
    }

    public static String toEnglish(String morse, String[] alphabet, String[] morseCode){
        String[] morseArr = morse.split(" ");
        String result = "";
        for (String s : morseArr) {
            if(s.equals("/")){
                result += " ";
            } else {
                int index = Arrays.asList(morseCode).indexOf(s);
                result += alphabet[index];
            }
        }
        return result;
    }

    public static void printMorse(){
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter your English here");
        String input = sb.nextLine().toLowerCase();
        System.out.println("RESULT\n");
        System.out.println(toMorse(input, getAlphabet(), getMorseCode()));
        System.out.println();
    }

    public static void printEnglish(){
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter your Morse Code here");
        String input = sb.nextLine().toLowerCase();
        System.out.println("RESULT\n");
        System.out.println(toEnglish(input, getAlphabet(), getMorseCode()));
        System.out.println();
    }

    // Getters and Setters

    public static String[] getMorseCode() {
        return morseCode;
    }

    public static String[] getAlphabet() {
        return alphabet;
    }
}
