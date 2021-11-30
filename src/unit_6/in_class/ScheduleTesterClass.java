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
        int numStudents = inF.nextInt();
        inF.nextLine(); //Dummy read to skip the line break "\n"
        Student[] stuList = new Student[numStudents]; // Create array of student objects
        int index = 0;


        // Create loop to read all data in the "studentScheduleData.txt" file
        while(inF.hasNextLine()){
            String studentName = inF.nextLine();
            Course[] studentSchedule = new Course[8]; // All values start as null hehe
            for(int i = 0; i < 8; i++){ // Runs once for each course
                String teacherName = inF.nextLine();
                String courseName = inF.nextLine();
                String studentGrade = inF.nextLine();
                int period = inF.nextInt();

                // Check if there is another character
                if(inF.hasNextLine()){
                    inF.nextLine();//Dummy read to skip the line break "\n"
                }
                Course tempCourse;
                // test if the grade is "None"
                if(studentGrade.equals("None")){
                    tempCourse = new Course(courseName, period);
                } else {
                // Create Course Object
                    tempCourse = new Course(teacherName, studentGrade, courseName, period);
                }
                // Add Course object to student schedule array
                studentSchedule[i] = tempCourse;


            }
            Student stu = new Student(studentName, studentSchedule);

            // Add the Student to "stuList"
            stuList[index] = stu;
            index++;
        }
        // Call the printAll methos to display all Students
        printAll(stuList);
    }


    // Create printAll static method that displays every student
    public static void printAll(Student[] arr) {
        // Traditional for loop
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                System.out.println(arr[i]);
            }
        }
    }
    /*
        public static void printAll(Student[] arr) {
        // Enhanced for loop
        for (Student tempStudent : arr) {
            if (tempStudent != null) {
                System.out.println(tempStudent);
            }
        }
    }
     */
}
