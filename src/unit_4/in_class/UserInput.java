package unit_4.in_class;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);

        System.out.print("Please enter first number to be added (enter 0 to stop): ");

        int num = sb.nextInt();     //read input value
        double sum = 0;
        int count = 0;

        while(num != 0){
            sum += num;     // add input value to sum
            count++;
            System.out.println("Please enter another value (enter 0 to stop): ");
            num = sb.nextInt();
        }
        System.out.println("Your sum is: " + sum);
        System.out.println("Your average is " + sum / count);
    }
}