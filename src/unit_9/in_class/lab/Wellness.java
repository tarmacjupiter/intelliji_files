package unit_9.in_class.lab;

import java.util.concurrent.ThreadLocalRandom;

public class Wellness extends Workout {
    private int numStretches;

    // Constructor
    public Wellness(String name, int workoutNum, int duration, int numStretches) {
        super(name, workoutNum, duration);
        this.numStretches = numStretches;
    }

    @Override // Partial
    public String toString(){
        return "WORKOUT #" + getWorkoutNum() + ":\t\t" + getName() + "\t\t" + getDuration();
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
