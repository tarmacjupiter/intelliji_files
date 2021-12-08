package unit_6.lab2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaTester2 {
    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame2 game = new TriviaGame2();
        Scanner sb = new Scanner(System.in);

        System.out.println("***BEGIN TRIVIA GAME***\n");

        Questions2[] arr = game.getRandomizedQuestions();
        String[] arrAnswers = game.getAnswersForQuestions();

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            String input = sb.nextLine().toLowerCase();
            String answer = arrAnswers[i].toLowerCase();

            if(input.equals(answer)){
                System.out.println("This is the right answer!\n");
            } else {
                System.out.println("This is the wrong answer!\n");
            }

            System.out.println("Do you want to continue?\n('Yes' or 'No')");
            String continueStatus = sb.nextLine().toLowerCase();
            while(!continueStatus.equals("yes")){
                if(continueStatus.equals("no")){
                    System.out.println("Thank you for playing!");
                    return;
                }
                System.out.println("This is not a valid input!\nPlease type ('Yes' or 'No')");
                continueStatus = sb.nextLine().toLowerCase();
            }
        }

//        for(int i = 0; i < game.getNumOfQuestions(); i++){
//            int randomNum = random.nextInt((game.getNumOfQuestions() - 1) + 1 - 0) + 0;
//            if(game.getQuestions2s(randomNum) != game.getQuestions2s(randomNum)){
//                System.out.println(game.getQuestions2s(randomNum));
//            } else {
//                i--;
//            }
//
//        }

//        boolean status = true;
//        while(true){
//            int randomNum = random.nextInt((game.getNumOfQuestions() - 1) + 1 - 0) + 0;
//            System.out.println(randomNum);
//            System.out.println(game.getQuestions2s(randomNum));
//            String answer = game.getAnswersForQuestions(randomNum).toLowerCase();
//            String input = sb.nextLine().toLowerCase();
//
//            if(input.equals(answer)){
//                System.out.println("Correct! You are smart!");
//            } else {
//                System.out.println("Incorrect, you are a dummy!");
//            }
//        }

    }
}


