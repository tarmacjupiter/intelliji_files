package unit_6.in_class;

import java.util.Arrays;

public class Student {
    // Instance variables
    private Course[] classes;
    private String name;

    // Full Constructor
    public Student(String name, Course[] classes){
        this.name = name;
        this.classes = classes;
    }

    // Partial Constructor
    public Student(String name){
        this.name = name;
        this.classes = new Course[8]; // all indices are null
    }

    /**
     * A to string method which returns a String of all the Student data
     * @return a String containing the data of a Student object
     */
    public String toString(){
        String output = "";
        output += "Name:\t" + name + "\n";
        for (Course aClass : classes) {
            if (aClass == null) {
                output += "\t\tNo Class Listed\n";
            } else {
                output += aClass + "\n";
            }
        }
        return output;
    }

    // Getters and Setters

    public Course[] getClasses() {
        return classes;
    }

    public void setClasses(Course[] classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
