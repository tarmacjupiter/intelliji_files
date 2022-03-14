package unit_9.lab;

import java.util.concurrent.ThreadLocalRandom;

public class WorkoutPlan {
    // Instance variables
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

    /**
     * The WorkoutPlan Constructor that takes the totalNumOfWeeks as a parameter.
     * The Contructor iterates throughout the totalNumOfWeeks for the outer for-loop (representing the rows)
     * The inner for-loop iterates numOfDaysInWeek (representing the columns)
     *
     * A random number between [1,3] determine which workout will be assigned that specific [i][j] index of the
     * 2 dimensional workouts array
     * @param totalNumOfWeeks
     */
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

                    //Calculating total minOfExercise and burnedCalories for that workout
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
            // Keeping track of the burnedCalories and the minOExercise variables, storing in 2D Array
            stats[i][0] = burnedCalories;
            stats[i][1] = minOfExercise;
        }
    }

    /**
     * toString method accessing the toString of every particular workout
     * @return a large String
     */
    public String toString(){
        String output = "";
        for(Workout[] w : workouts){
            setCurrentWorkoutWeek(1);
            output += "\n***** WEEK #: " + currentWorkoutWeek + " *****\n";
            output += String.format("%-19s%-25s%s", "WORKOUT", "NAME", "MINUTES");
            output += "\n";
            for(Workout specificWorkout : w){
                output += specificWorkout.toString() + "\n";
            }
        }
        return output;
    }

    /**
     * Iterates through a week and goes workout by workout to determine if there are any skipped workouts
     * @param i (Is used to check for the progress for ONE week)
     */
    public void workoutNextWeek(int i){
        if(i >= stats.length){
            return;
        }
        Workout[] week = workouts[i];
        for(Workout workout : week){
            int randomNum = ThreadLocalRandom.current().nextInt(1, 11);
            if(randomNum <= 2){
                skippedWorkouts++;
                System.out.println("Skipped workout #:\t" + workout.getWorkoutNum());
            } else {
                completedWorkouts++;
            }
        }
    }

    /**
     * Prints the progress later used in the Tester class, will check if workout weeks are completed or not
     * @param i (Is used to check for the progress for ONE week)
     *          E.x. If there are 3 weeks are we call printProgress(0) that will show the status for week 1
     */
    public void printProgress(int i){
        if(i >= stats.length){
            System.out.println();
            System.out.println("***** CONGRATS *****");
            System.out.println("YOU HAVE COMPLETED YOUR " + totalNumOfWeeks + " WEEK PLAN");
            System.out.println("HERE IS A SUMMARY OF YOUR ENTIRE PLAN");
            System.out.println();
            System.out.println("NUMBER OF WORKOUTS COMPLETED:\t" + completedWorkouts);
            System.out.println("NUMBER OF WORKOUTS SKIPPED:\t\t" + skippedWorkouts);
            System.out.println("TOTAL MINUTES OF EXERCISE:\t\t" + minOfExercise);
            System.out.println("TOTAL CALORIES BURNED:\t\t\t" + burnedCalories);
            System.out.println();
            System.out.println("you better keep working out... or else.");
            System.out.println();
            return;
        } else {
            System.out.println();
            System.out.println("***** CURRENT PROGRESS *****");
            System.out.println("Number of workouts completed:\t" + completedWorkouts);
            System.out.println("Number of workouts skipped:\t\t" + skippedWorkouts);
            System.out.println("Total minutes of exercise:\t\t" + stats[i][1]);
            System.out.println("Total calories burned:\t\t\t" + stats[i][0]);
            System.out.println();
        }
    }

    /**
     * Generates a random number between [x, y)
     * @param min
     * @param max
     * @return the random number
     */
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
