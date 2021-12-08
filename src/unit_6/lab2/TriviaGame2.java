package unit_6.lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame2 {
    private static Questions2[] questions2s;
    private static String[] answersForQuestions;
    private static int numOfQuestions;
    //We want an array full of question objects

    /*
    When we call the TriviaGame2 constructor we want questions to be pushed
    into the "questions2s" variable.

    So that when we call questions2s[1] or question2s[0] we get those particular
    indexes from the array
     */
    public TriviaGame2() throws FileNotFoundException {
        readQuestions();
    }

    public static void readQuestions() throws FileNotFoundException {
        File questionData = new File("questions.txt");
        Scanner inF = new Scanner(questionData);
        Scanner sb = new Scanner(System.in);

        // Read the total number of Questions
        numOfQuestions = inF.nextInt();
        inF.nextLine();

        //Create empty array to later assign to questions2s
        Questions2[] qList = new Questions2[numOfQuestions];
        //Create empty array for answers
        String[] answersList = new String[numOfQuestions];

        // Variable to count indexes
        int index = 0;

        while(inF.hasNextLine()){
            String question = inF.nextLine();
            String q1 = inF.nextLine();
            String q2 = inF.nextLine();
            String q3 = inF.nextLine();
            String q4 = inF.nextLine();
            String answer = inF.nextLine();
            Questions2 temp = new Questions2(question, q1, q2, q3, q4, answer);
            answersList[index] = answer;
            qList[index] = temp;
            index++;
        }
        answersForQuestions = answersList;
        questions2s = qList;
    }

    //Getters and Setters

    public static Questions2 getQuestions2s(int num) {
        return questions2s[num];
    }

    public static void setQuestions2s(Questions2[] questions2s) {
        TriviaGame2.questions2s = questions2s;
    }

    public static String getAnswersForQuestions(int num) {
        return answersForQuestions[num];
    }

    public static void setAnswersForQuestions(String[] answersForQuestions) {
        TriviaGame2.answersForQuestions = answersForQuestions;
    }

    public static int getNumOfQuestions() {
        return numOfQuestions;
    }

    public static void setNumOfQuestions(int numOfQuestions) {
        TriviaGame2.numOfQuestions = numOfQuestions;
    }
}
