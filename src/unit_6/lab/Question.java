package unit_6.lab;

public class Question {
    // Instance Variables
    private String question, choiceOne, choiceTwo, choiceThree, choiceFour;
    private int valueOne, valueTwo, valueThree, valueFour;

    // Full Constructor
    public Question(String question, String choiceOne, String choiceTwo, String choiceThree, String choiceFour, int valueOne, int valueTwo, int valueThree, int valueFour) {
        this.question = question;
        this.choiceOne = choiceOne;
        this.choiceTwo = choiceTwo;
        this.choiceThree = choiceThree;
        this.choiceFour = choiceFour;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.valueThree = valueThree;
        this.valueFour = valueFour;
    }

    //toString method
    public String toString(){
        String output = "";
        output += question + "\n";
        output += "\t" + choiceOne + "\n";
        output += "\t" + choiceTwo + "\n";
        output += "\t" + choiceThree + "\n";
        output += "\t" + choiceFour + "\n";
        return output;
    }

    // Getters and Setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getChoiceOne() {
        return choiceOne;
    }

    public void setChoiceOne(String choiceOne) {
        this.choiceOne = choiceOne;
    }

    public String getChoiceTwo() {
        return choiceTwo;
    }

    public void setChoiceTwo(String choiceTwo) {
        this.choiceTwo = choiceTwo;
    }

    public String getChoiceThree() {
        return choiceThree;
    }

    public void setChoiceThree(String choiceThree) {
        this.choiceThree = choiceThree;
    }

    public String getChoiceFour() {
        return choiceFour;
    }

    public void setChoiceFour(String choiceFour) {
        this.choiceFour = choiceFour;
    }

    public int getValueOne() {
        return valueOne;
    }

    public void setValueOne(int valueOne) {
        this.valueOne = valueOne;
    }

    public int getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(int valueTwo) {
        this.valueTwo = valueTwo;
    }

    public int getValueThree() {
        return valueThree;
    }

    public void setValueThree(int valueThree) {
        this.valueThree = valueThree;
    }

    public int getValueFour() {
        return valueFour;
    }

    public void setValueFour(int valueFour) {
        this.valueFour = valueFour;
    }
}
