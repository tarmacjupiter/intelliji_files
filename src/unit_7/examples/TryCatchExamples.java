package unit_7.examples;

import java.util.Scanner;

public class TryCatchExamples {
    public static void main(String[] args) {
        boolean isValid = true;
        while(isValid){
            try {
//                int[] nums = new int[4];
//                nums[4] = 5;
                System.out.println("Please enter a number between 1-10");
                Scanner inF = new Scanner(System.in);
                int num = inF.nextInt();
                if(num > 0 && num < 11){
                    System.out.println(num);
                    isValid = false;
                }
            } catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            } catch (Exception e){
                System.out.println("A number between 1-10 you idiot");
                System.out.println(e);
            }
        }
    }
}
