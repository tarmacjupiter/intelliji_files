package unit_8.examples;

import java.util.Arrays;

public class MorseCode {
    public static void main(String[] args) {
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] alphabet = { "a", "b", "c", "d", "e", "f",
                "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x",
                "y", "z"};

        System.out.println(toMorse("hello", alphabet, morseCode));
    }
    public static String toMorse(String str, String[] alphabet, String[] morseCode){
        String[] strArr = str.split("");
        String result = "";
        for(int i = 0; i < strArr.length; i++){
            int index = Arrays.asList(alphabet).indexOf(strArr[i]);
            result += morseCode[index] + " ";
        }
        return result;
    }

//    public static String toEnglish(String morse, String[] alphabet, )
}
