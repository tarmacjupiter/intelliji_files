package unit_9.in_class.lab;

import java.util.concurrent.ThreadLocalRandom;

public class Workout {
    private String name;
    private int workoutNum;
    private int duration;

    // Constructor
    public Workout(String name, int workoutNum, int duration) {
        this.name = name;
        this.workoutNum = workoutNum;
        this.duration = ThreadLocalRandom.current().nextInt(10, 41);
    }

    public Workout(){}

    @Override // Partial
    public String toString(){
        String output = "";
        output += "WORKOUT #" +  getWorkoutNum() + ":";
        output += "\t" + getName();
        while(output.length() < 15){
            output += " ";
        }
        output += "\t" + getDuration();
        return output;
    }

    // Starting exercise
    public int startExercise(){
        System.out.println("Starting a workout");
        return 0;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkoutNum() {
        return workoutNum;
    }

    public void setWorkoutNum(int workoutNum) {
        this.workoutNum = workoutNum;
    }

    public void setWorkoutNum(int workoutNum, String add){
        this.workoutNum += workoutNum;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
