package unit_6.lab2;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TriviaTester2 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        System.out.println("***BEGIN TRIVIA GAME***\n");
        startQuiz();
    }
    //Checking for git connection
    /**
     * The chunk of the program, accesses the TriviaGame2 class and runs through the logistics of the game
     * @throws FileNotFoundException "Signals that an attempt to open the file denoted by a specified pathname has failed"
     * @throws InterruptedException "Thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted, either before or during the activity"
     */
    public static void startQuiz() throws FileNotFoundException, InterruptedException {
        TriviaGame2 game = new TriviaGame2();
        Questions2[] arr = game.getRandomizedQuestions();
        String[] arrAnswers = game.getAnswersForQuestions();
        Scanner sb = new Scanner(System.in);
        // Scores, update during game
        int correct = 0;
        int wrong = 0;
        int answerStreak = 0;

        //Total correct to divide by later
        int answeredQuestions = 5 * game.getAnswersForQuestions().length;

        // Iterate through entire array of questions
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            String input = sb.nextLine().toLowerCase();
            String answer = arrAnswers[i].toLowerCase();

            // Logic to check if answer equals the users input
            if(input.equals(answer)){
                System.out.println("This is the right answer!\n");
                correct += 5;
                answerStreak++;
            } else {
                System.out.println("This is the wrong answer!\n");
                System.out.println("The right answer was:\n\t" + arrAnswers[i] + "\n");
                wrong++;
                answerStreak = 0;
            }

            System.out.println("Your current score is:\n\t" + correct);
            System.out.println("Your current answer streak is:\n\t" + answerStreak);

            System.out.println("Do you want to continue?\n('Y' or 'N')");
            String continueStatus = sb.nextLine().toLowerCase();
            // Trap the user to force them to answer a question
            while(!continueStatus.equals("y")){
                if(continueStatus.equals("n")){
                    System.out.println("Thank you for playing!");
                    System.out.println("Your final score is\n\t\t" + correct + "/" + answeredQuestions);
                    System.out.println("You got " + correct/5 + " answers right");
                    System.out.println("You got " + wrong + " answers wrong");
                    return;
                }
                System.out.println("This is not a valid input!\nPlease type ('Y' or 'N')");
                continueStatus = sb.nextLine().toLowerCase();
            }
        }
        // Print out the results of the game
        System.out.println("Your final score is\n\t\t" + correct + "/" + answeredQuestions);
        System.out.println("You got " + correct/5 + " answers right");
        System.out.println("You got " + wrong + " answers wrong");

        // Wait 3 seconds
        TimeUnit.SECONDS.sleep(3);

        // Logic to ask user if they would like to play again
        System.out.println("Do you want to play again?\n('Y' or 'N')");
        String playAgain = sb.nextLine().toLowerCase();
        if(playAgain.equals("y")){
            startQuiz();
        } else if(playAgain.equals("n")){
            System.out.println("Thanks again!");
            return;
        }
    }
}