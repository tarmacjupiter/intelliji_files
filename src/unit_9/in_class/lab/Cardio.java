package unit_9.in_class.lab;

import java.util.concurrent.ThreadLocalRandom;

public class Cardio extends Workout {
    private int miles;
    private final int minPerHour = 60;

    public Cardio(String name, int workoutNum, int duration, int miles){
        super(name, workoutNum, duration);
        this.miles = miles;
    }

    @Override // Partial
    public String toString(){
        return getWorkoutNum() + ":\t" + getName() + "\t" + getDuration();
    }

    // Random number between 80-140 and divided that by the total amount of miles ran
    public int startExericse(){
        int randomNum = ThreadLocalRandom.current().nextInt(80, 140 + 1);
        return miles / randomNum;
    }

    // Getters and Setters

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getMinPerHour() {
        return minPerHour;
    }
}
