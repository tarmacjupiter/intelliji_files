package unit_6.lab2;

import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TriviaTester2 {
    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame2 game = new TriviaGame2();
        Scanner sb = new Scanner(System.in);
        Random random = new Random();

        System.out.println("***BEGIN AMAZING TRIVIA GAME***");

//        for(int i = 0; i < game.getNumOfQuestions(); i++){
//            int randomNum = random.nextInt((game.getNumOfQuestions() - 1) + 1 - 0) + 0;
//            if(game.getQuestions2s(randomNum) == game.getQuestions2s(randomNum)){
//                System.out.println(game.getQuestions2s(randomNum));
//            } else {
//                i--;
//            }
//
//        }

        boolean status = true;
        while(true){
            int randomNum = random.nextInt((game.getNumOfQuestions() - 1) + 1 - 0) + 0;
            System.out.println(randomNum);
            System.out.println(game.getQuestions2s(randomNum));
            String answer = game.getAnswersForQuestions(randomNum).toLowerCase();
            String input = sb.nextLine().toLowerCase();

            if(input.equals(answer)){
                System.out.println("Correct! You are smart!");
            } else {
                System.out.println("Incorrect, you are a dummy!");
            }
        }

    }
}


