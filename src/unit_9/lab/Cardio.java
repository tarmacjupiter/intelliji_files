package unit_9.lab;

import java.util.concurrent.ThreadLocalRandom;

public class Cardio extends Workout {
    private int distance;
    private final int minPerHour = 60;

    public Cardio(String name, int workoutNum, int duration, int distance){
        super(name, workoutNum, duration);
        this.distance = distance;
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
        return String.format("WORKOUT #%s:%-10s%-5s", getWorkoutNum(), getName(), getDuration());
    }

    // Random number between 80-140 and divided that by the total amount of miles ran
    public int startExericse(){
        int randomNum = ThreadLocalRandom.current().nextInt(80, 140 + 1);
        return distance / randomNum;
    }

    // Getters and Setters

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getMinPerHour() {
        return minPerHour;
    }
}
