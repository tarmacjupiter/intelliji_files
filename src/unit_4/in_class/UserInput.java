package unit_4.in_class;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);

        System.out.print("Please enter first number to be added (enter 999 to stop): ");

        int num = sb.nextInt();     //read input value
        int sum = 0;

        while(num != 999){
            sum += num;     // add input value to sum
            System.out.println("Please enter another value (enter 999 to stop): ");
            num = sb.nextInt();
        }
        System.out.println("Your sum is: " + sum);
    }
}
