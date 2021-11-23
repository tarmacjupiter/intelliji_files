package unit_6.in_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScheduleTesterClass {
    public static void main(String[] args) throws FileNotFoundException {
        // Instantiate 8 Class Objects
        Course per1 = new Course("Mr. Nichols", "A+", "Math", 1);
        Course per2 = new Course("Mr. Hardy", "A", "PLTW", 2);
        Course per3 = new Course("Mr. Widloski", "A-", "Social Studies", 3);
        Course per4 = new Course("Mr. Brandenburg", "A", "Wellness", 4);
        Course per5 = new Course("Mrs. Junge", "A-", "Math", 5);
        Course per6 = new Course("Mr. Grattoni", "A", "Secondary Ed Internship", 6);
        Course per7 = new Course("Lunch", 7);
        Course per8 = new Course("Mrs. Enk", "A", "English", 8);

        // Initialize Array of Courses
        Course[] myClasses = {per1, per2, per3, per4, per5, per6, per7, per8};

        // Make Student Object
        Student anthony = new Student("Anthony B", myClasses);

        System.out.println(anthony);

        // Begin File Reading
        File studentData = new File("studentScheduleData.txt"); // Create File Object
        Scanner inF = new Scanner(studentData);                          // Create Scanner Object for the text file hehe
        System.out.println("*** BEGIN FILE READ ***");
        System.out.println(inF.nextInt());
        inF.nextLine(); //Dummy read to skip the line break
        System.out.println(inF.nextLine());

    }
}
