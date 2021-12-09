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

        // Scores, update during game
        int correct = 0;
        int wrong = 0;

        //Total correct to divide by later
        int answeredQuestions = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            String input = sb.nextLine().toLowerCase();
            String answer = arrAnswers[i].toLowerCase();
            answeredQuestions++;

            if(input.equals(answer)){
                System.out.println("This is the right answer!\n");
                correct++;
            } else {
                System.out.println("This is the wrong answer!\n");
                System.out.println("The right answer was:\n\t" + arrAnswers[i] + "\n");
                wrong++;
            }

            System.out.println("Your current correct is:\n\t" + correct);

            System.out.println("Do you want to continue?\n('Y' or 'N')");
            String continueStatus = sb.nextLine().toLowerCase();
            while(!continueStatus.equals("y")){
                if(continueStatus.equals("n")){
                    System.out.println("Thank you for playing!");
                    System.out.println("Your final score is\n\t\t" + correct + "/" + answeredQuestions);
                    System.out.println("You got " + correct + " answers right");
                    System.out.println("You got " + wrong + " answers wrong");
                    return;
                }
                System.out.println("This is not a valid input!\nPlease type ('Y' or 'N')");
                continueStatus = sb.nextLine().toLowerCase();
            }
        }
        System.out.println("Your final score is\n\t\t" + correct + "/" + answeredQuestions);
        System.out.println("You got " + correct + " answers right");
        System.out.println("You got " + wrong + " answers wrong");
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


