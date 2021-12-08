package unit_6.lab2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class TriviaGame2 {
    //Instance variables
    private static Questions2[] questions2s;
    private static String[] answersForQuestions;
    private static int numOfQuestions;
    private static Questions2[] randomizedQuestions;
    //We want an array full of question objects

    /*
    When we call the TriviaGame2 constructor we want questions to be pushed
    into the "questions2s" variable.

    So that when we call questions2s[1] or question2s[0] we get those particular
    indexes from the array
     */
    // Call Scanner object to use scanner in Constructor!
    Scanner scan = new Scanner(System.in);

    public TriviaGame2() throws FileNotFoundException {
        System.out.println("Which quiz would you like to play?");
        System.out.println("(Please type the number for the corresponding quiz!)");
        System.out.println("\t1.\tGuess the Christmas Song");
        System.out.println("\t2.\tGuess the Disney Song");
        System.out.println("\t3.\tSquid Game Quiz");
        int num = scan.nextInt();
        if(num == 1){
            readQuestions("ChristmasQuestions");
        } else if(num == 2){
            readQuestions("Disney");
        } else if(num == 3){
            readQuestions("SquidGame");
        }
    }

    public static void readQuestions(String fileName) throws FileNotFoundException {
        File questionData = new File("trivias/" + fileName + ".txt");
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
//        answersForQuestions = answersList;
        questions2s = qList;
        //Convert Arrays into Lists
        List<Questions2> randoQsList = Arrays.asList(qList);
        List<String> randoAsList = Arrays.asList((answersList));

        //Create long variable that stores the position of the computers time by the nanosecond
        long seed = System.nanoTime();

        /*
        Use the shuffle method in the Collections library to randomize the lists,
        also randomize the lists by a predetermined randomness from the "seed" variable
        */
        Collections.shuffle(randoQsList, new Random(seed));
        Collections.shuffle(randoAsList, new Random(seed));

        //Convert the lists back into an array, and store them into the instance variables
        randomizedQuestions = randoQsList.toArray(qList);
        answersForQuestions = randoAsList.toArray((answersList));
    }

    //Getters and Setters

    public static Questions2 getQuestions2s(int num) {
        return questions2s[num];
    }

    public static void setQuestions2s(Questions2[] questions2s) {
        TriviaGame2.questions2s = questions2s;
    }

    public static String[] getAnswersForQuestions() {
        return answersForQuestions;
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

    public static Questions2[] getRandomizedQuestions() {
        return randomizedQuestions;
    }

    public static void setRandomizedQuestions(Questions2[] randomizedQuestions) {
        TriviaGame2.randomizedQuestions = randomizedQuestions;
    }
}
