package unit_9.lab;

import java.util.concurrent.ThreadLocalRandom;

public class Wellness extends Workout {
    private int numStretches;

    // Constructor
    public Wellness(String name, int workoutNum, int duration, int numStretches) {
        super(name, workoutNum, duration);
        this.numStretches = numStretches;
    }

//    @Override // Partial
//    public String toString(){
//        String output = "";
//        output += "WORKOUT #" +  getWorkoutNum() + ":";
//        output += "\t\t" + getName();
//        while(output.length() < 29){
//            output += " ";
//        }
//        output += getDuration();
//        return output;
//    }

    public String toString(){
        return String.format("WORKOUT #%s:%-10s%-5s", getWorkoutNum(), getName(), getDuration());
    }

    // Generates a random number between [5,10] representing the calories burned per stretch
    // Calculates and returns total calories (rounded to whole number) by taking the product of the calories per stretch and the number of stretches
    public int startExercise(){
        int random = ThreadLocalRandom.current().nextInt(5, 10 + 1);
        return numStretches / random;
    }

    // Getters and Setters

    public int getNumStretches() {
        return numStretches;
    }

    public void setNumStretches(int numStretches) {
        this.numStretches = numStretches;
    }
}
