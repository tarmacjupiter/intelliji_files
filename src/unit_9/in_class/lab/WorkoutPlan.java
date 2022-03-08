package unit_9.in_class.lab;

import java.util.concurrent.ThreadLocalRandom;

public class WorkoutPlan {
    private int totalNumOfWeeks;
    private int completedWorkouts;
    private int skippedWorkouts;
    private int currentWorkoutWeek;
    private int nextWorkout;
    private int burnedCalories;
    private int minOfExercise;
    private Workout[][] workouts;
    private int totalWorkouts;

    // Row represents each week
    // The first index in the column will represent the total calories for that week
    // The second index in the column will represent the total minOfExercises
    int[][] stats;

    private final int numOfDaysInWeek = 7;

    public WorkoutPlan(int totalNumOfWeeks){
        this.totalNumOfWeeks = totalNumOfWeeks;
        workouts = new Workout[totalNumOfWeeks][numOfDaysInWeek];
        stats = new int[totalNumOfWeeks][2];

        // Outer loop iterates through amount of weeks
        for(int i = 0; i < totalNumOfWeeks; i++){
            //Inner loop iterates 7 times, for every day of the week
            for(int j = 0; j < numOfDaysInWeek; j++){
                // Create a random number between [1,3] to choose which workout to generate
                int randomNum = ThreadLocalRandom.current().nextInt(1, 4);
                // nextWorkout starts at 0, so incrementing by 1 makes the workouts start at #1
                nextWorkout++;


                if(randomNum == 1){
                    // Random numbers per specified workout
                    int minForExercise = generateRandomNum(15, 60);
                    int caloriesForExercise = generateRandomNum(95, 225);

                    //Creating workout object via inheritance
                    Workout workout = new Strength("Lifting", nextWorkout, minForExercise, caloriesForExercise);


                    workouts[i][j] = workout;

                    //Calculating total minOfExerice and burnedCalories for that workout
                    minOfExercise += minForExercise;
                    burnedCalories += caloriesForExercise;
                } else if(randomNum == 2){
                    int minForExercise = generateRandomNum(10, 40);
                    int distanceForExercise = generateRandomNum(1, 7);

                    Workout workout = new Cardio("Running", nextWorkout, minForExercise, distanceForExercise);

                    workouts[i][j] = workout;

                    minOfExercise += minForExercise;
                } else if(randomNum == 3){
                    int minForExercise = generateRandomNum(30, 60);
                    int numOfStretches = generateRandomNum(8, 12);

                    Workout workout = new Wellness("Stretching", nextWorkout, minForExercise, numOfStretches);

                    workouts[i][j] = workout;

                    minOfExercise += minForExercise;
                }
            }
            stats[i][0] = burnedCalories;
            stats[i][1] = minOfExercise;
        }
    }

    public String toString(){
        String output = "";
        for(Workout[] w : workouts){
            setCurrentWorkoutWeek(1);
            output += "***** WEEK #: " + currentWorkoutWeek + " *****\n";
            output += "WORKOUT\t\t\tNAME\t\t\tMINUTES\n";
            for(Workout specificWorkout : w){
                output += specificWorkout.toString() + "\n";
            }
        }
        return output;
    }

    public void workoutNextWeek(){
        for(Workout[] w : workouts){
            for(Workout specificWorkout : w){
                int randomNum = generateRandomNum(1, 8);
                if (randomNum <= 2){
                    System.out.println("Skipped Workout #: " + specificWorkout.getWorkoutNum());
                    skippedWorkouts++;
                } else {
                    completedWorkouts++;
                }
            }
        }
    }

    public void printProgress(int i){
        if(i >= stats.length){
            System.out.println();
            System.out.println("***** CONGRATS *****");
            System.out.println("YOU HAVE COMPLETED YOUR " + totalNumOfWeeks + " WEEK PLAN");
            System.out.println("HERE IS A SUMMARY OF YOUR ENTIRE PLAN");
            System.out.println();
            System.out.println("NUMBER OF WORKOUTS COMPLETED:\t" + completedWorkouts);
            System.out.println("NUMBER OF WORKOUTS SKIPPED:\t" + skippedWorkouts);
            System.out.println("TOTAL MINUTES OF EXERCISE:\t" + minOfExercise);
            System.out.println("TOTAL CALORIES BURNED:\t" + burnedCalories);
            System.out.println("you better keep working out... or else.");
            return;
        } else {
            System.out.println("Starting!");
            System.out.println("***** CURRENT PROGRESS *****");
            System.out.println("Number of workouts completed:\t" + completedWorkouts);
            System.out.println("Number of workouts skipped:\t" + skippedWorkouts);
            System.out.println("Total minutes of exercise:\t" + stats[i][1]);
            System.out.println("Total calories burned:\t" + stats[i][0]);
        }
    }

    public int generateRandomNum(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }


    // Getters and Setters
    public Workout[][] getWorkouts() {
        return workouts;
    }

    public void setWorkouts(Workout[][] workouts) {
        this.workouts = workouts;
    }

    public int getCurrentWorkoutWeek() {
        return currentWorkoutWeek;
    }

    public void setCurrentWorkoutWeek(int currentWorkoutWeek) {
        this.currentWorkoutWeek += currentWorkoutWeek;
    }

    public int getTotalWorkouts() {
        return totalWorkouts;
    }

    public void setTotalWorkouts(int totalWorkouts) {
        this.totalWorkouts = totalWorkouts;
    }

    public int getTotalNumOfWeeks() {
        return totalNumOfWeeks;
    }

    public void setTotalNumOfWeeks(int totalNumOfWeeks) {
        this.totalNumOfWeeks = totalNumOfWeeks;
    }

    public int[][] getStats() {
        return stats;
    }

    public void setStats(int[][] stats) {
        this.stats = stats;
    }
}
