package unit_9.lab;

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
        return String.format("%-10s%-25s%s\n", getWorkoutNum(), getName(), getDuration());
    }

    /**
     * Starts an exercise
     * @return 0
     */
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
