package unit_9.lab;

import java.util.concurrent.ThreadLocalRandom;

public class Strength extends Workout {
    private int weight;

    public Strength(String name, int workoutNum, int duration, int weight) {
        super(name, workoutNum, duration);
        this.weight = ThreadLocalRandom.current().nextInt(95, 226);
    }

//    @Override // Partial
//    public String toString(){
//        String output = "";
//        output += "WORKOUT #" +  getWorkoutNum() + ":";
//        output += "\t\t" + getName();
//        output += "\t\t\t" + getDuration();
//        return output;
//    }

    public String toString(){
        return String.format("WORKOUT #%s:%20s %5s", getWorkoutNum(), getName(), getDuration());
    }

    // Generates a random number between [1,3] representing a multiplier
    // Calculates and returns total calories (rounded to whole number) by taking the product of the multiplier and weight used
    public int startExercise(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        return randomNum * weight;
    }

    // Getters and Setters
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
