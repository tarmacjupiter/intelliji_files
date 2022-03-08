package unit_9.in_class.lab;

import java.util.Scanner;

public class WorkoutTester {
    private static WorkoutPlan workoutPlan;
    public static void main(String[] args) {
        System.out.println("************************************************************");
        System.out.println("********* Welcome to your customized workout plan! *********");
        System.out.println("************************************************************");
        boolean status = true;
        Scanner sb = new Scanner(System.in);
        while(status){
            try {
                // Ask user how many weeks they want in their schedule
                System.out.println("How many weeks would you like to schedule?");
                int weeks = sb.nextInt();
                // Print out the details of their workout plan
                workoutPlan = new WorkoutPlan(weeks);
                System.out.println("Great! Now lets take a look at your " + weeks + " week schedule!");
                System.out.println(workoutPlan);
                System.out.println();
                System.out.println("Time to start working out!");
                workoutPlan.workoutNextWeek();

                // Fill array of numbers to keep track of skipped and completed workouts
                int[] numArr = new int[workoutPlan.getTotalWorkouts()];
                fillArray(numArr, workoutPlan.getTotalWorkouts());

                startingWorkouts();
                status = false;

            } catch (Exception e){
                System.out.println("Please enter a valid integer!");
            }
        }
    }

    /**
     * Fills an array, starting at 1, to how many workouts there are
     * E.G. For 2 weeks there are 14 workouts, so the respective array would look like
     * [1,2,3,4,5,6,7,9,10,11,12,13,14]
     * @param arr to be modified
     * @param num the max number to go to
     */
    public static void fillArray(int[] arr, int num){
        for(int i = 0; i < num; i++){
            arr[i] = i + 1;
        }
    }

    public static void startingWorkouts(){
        Scanner sb = new Scanner(System.in);
        boolean status = true;
        while(status){
            try {
                // Ask user to start working out
                System.out.println("Type 'Start' to complete one week of workouts:");
                String startingWorkout = sb.nextLine().toLowerCase();
                if(startingWorkout.equals("start")){
                    System.out.println("Starting!");
                } else {
                    System.out.println("Not starting idiot!");
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
