package unit_6.lab;

import java.io.File;
import java.io.FileNotFoundException;
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

        numOfQuestions = inF.nextInt(); // Reads total amount of questions in start of the program
        inF.nextLine();

        TriviaGame[] questionList = new TriviaGame[numOfQuestions];

        while(inF.hasNextLine()){
            Question[] tempQuestions = new Question[numOfQuestions]; // All values are null here
            for(int i = 0; i < numOfQuestions; i++){
                String question = inF.nextLine();
                String qOne = inF.nextLine();
                System.out.println(question);
                System.out.println(qOne);
                System.out.println(tempQuestions.toString());
            }
        }

    }

    // Getters and Setters

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
}
