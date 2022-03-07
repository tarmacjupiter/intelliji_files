package unit_9.in_class.lab;

public class Workout {
    private String name;
    private int workoutNum;
    private int duration;

    // Constructor
    public Workout(String name, int workoutNum, int duration) {
        this.name = name;
        this.workoutNum = workoutNum;
        this.duration = duration;
    }

    // toString method
    public String toString(){
        return "WORKOUT #" + workoutNum + ":\t" + name + "\t" + duration;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
