package unit_6.lab2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaTester2 {
    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame2 game = new TriviaGame2();
        Scanner sb = new Scanner(System.in);
        System.out.println(game.getQuestions2s(1));
        String input = sb.nextLine();
        

    }
}
