package unit_6.lab;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws IOException {
        Scanner sb = new Scanner(System.in);
        Question q1 = new Question("What is the brand of the computer I am working on?", "Dell", "HP", "Razor", "Spectre", "Dell");

        System.out.println(q1.toString());
        String answer = sb.nextLine();
        if(answer.equals(q1.getAnswer())){
            System.out.println("This is the right answer!");
        } else {
            System.out.println("this is not the right answer!");
        }
        TriviaGame.readQuestions();
    }
}
