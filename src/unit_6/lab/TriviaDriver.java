package unit_6.lab;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws IOException {
        TriviaGame.readQuestions();
    }
}
