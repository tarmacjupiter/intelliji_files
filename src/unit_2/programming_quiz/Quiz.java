package unit_2.programming_quiz;

import java.util.Locale;

public class Quiz
{

    // *** WRITE CODE HERE ***
    // Part A
    // Create instance variables for the quiz name, number of MC's,
    // and extra credit status
    private String name;
    private int questions;
    private boolean extraCredit;


    // *** WRITE CODE HERE ***
    // Part B
    // Create a default Quiz constructor that sets the name
    // to "M359 Pop Quiz", has 3 MC's, and offers no extra credit

    public Quiz(){
        name = "M359 Pop Quiz";
        questions = 3;
        extraCredit = false;
    }


    // *** WRITE CODE HERE ***
    // Part C
    // Create a full Quiz constructor that accepts each instance
    // variable as a parameter
    public Quiz(String quizName, int numQuestions, boolean EC){
        name = quizName;
        questions = numQuestions;
        extraCredit = EC;
    }


    /*
     / *** WRITE CODE HERE ***
     / Part D
     / Create a printInfo method that prints a nicely formatted
     / summary to the console with the following information:
     /      QUIZ NAME (TURN STRING INTO ALL CAPITALS)
     /          Number MC's:    #
     /          Has EC:         true/false
     */

    public void printInfo(){
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println("Number MC's:    " + questions);
        System.out.println("Has EC:         " + extraCredit);
    }

    // *** WRITE CODE HERE ***
    // Part E
    // Create an addMC method that accepts the number of MC questions
    // you are adding to this quiz as an input parameter, and updates
    // an appropriate instance variable.  This method does not return
    // anything

    public void addMC(int numToAdd){
        questions += numToAdd;
    }

    // *** WRITE CODE HERE ***
    // Part F
    // Create a calcExtraCredit method that returns a random integer
    // between the range of [2,6]

    public int calcExtraCredit(){
        int randomNum = (int)(Math.floor(Math.random() * 5 + 2));
        return randomNum;
    }

    // *** WRITE CODE HERE ***
    // Part G
    // Create a calcTotal method that accepts the point value for
    // each MC on the quiz and returns the total point value of quiz

    public double calcTotal(double numQuestions){
        double onePoint = 1 / numQuestions;
        return onePoint;
    }


    // *** WRITE CODE HERE ***
    // Part H
    // Create all getter and setter methods

    //GETTERS

    public String getName() {
        return name;
    }

    public int getQuestions(){
        return questions;
    }

    public boolean getExtraCredit(){
        return extraCredit;
    }

    //SETTERS

    public void setName(String newName){
        name = newName;
    }

    public void setQuestions(int newQuestions){
        questions = newQuestions;
    }

    public void setExtraCredit(boolean newEC){
        extraCredit = newEC;
    }


    // *** EXTRA CREDIT ***
    // Create a method named returnLastName that accepts a single parameter
    // (in the form of "FirstName LastName") and returns only the last name
    // Ex:  returnLastName("Mark Langer") would return "Langer"

    public String returnsLastName(String fullName){
        int index = fullName.indexOf(" ");
        return fullName.substring(index + 1);
    }

}
