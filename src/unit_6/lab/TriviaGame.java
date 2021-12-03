package unit_6.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TriviaGame {
    // Instance Variables
    private Question[] questions;
    private static int numOfQuestions;

    // Full Constructor
    public TriviaGame(Question[] questions) {
        this.questions = questions;
    }

    /**
     * Reads the questions starting from the top of the "questions.txt" file
     */
    public static void readQuestions() throws FileNotFoundException {
        File questionData = new File("questions.txt"); // Create file Object
        Scanner inF = new Scanner(questionData);                // Create scanner Object for text reading
        Scanner sb = new Scanner(System.in);

        numOfQuestions = inF.nextInt(); // Reads total amount of questions in start of the program
        inF.nextLine();

        Question[] qList = new Question[numOfQuestions]; // Create an array of Question objects
        int index = 0;

        while(inF.hasNextLine()){
            String question = inF.nextLine();
            String q1 = inF.nextLine();
            String q2 = inF.nextLine();
            String q3 = inF.nextLine();
            String q4 = inF.nextLine();
            String answer = inF.nextLine();
            Question temp = new Question(question, q1, q2, q3, q4, answer);
            System.out.println(temp);
            String input = sb.nextLine();
            if(input.equals(answer)){
                System.out.println("This is the right answer!");
            } else {
                System.out.println("This is not the right answer! ");
            }
            System.out.println("Do you want to continue? (Type 'Yes' or 'No')");
            String wantContinue = sb.nextLine();
            if(wantContinue.equals("Yes")){
                continue;
            } else if(wantContinue.equals("No")){
                System.out.println("Thanks for Playing!");
                break;
            } else {
                System.out.println("Please type a valid answer!");
            }
            qList[index] = temp;
            index++;
        }
//        System.out.println(Arrays.toString(qList));
    }

    // Getters and Setters

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
}
