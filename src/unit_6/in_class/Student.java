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
        output += "Name:\t" + name;
        for(int i = 0; i < classes.length; i++){
            if(classes[i] == null){
                output += "\t\tNo Class Listed\n";
            } else {
                output += classes[i] + "\n";
            }
//            output += "\t\tClass " + i+1 + ": " + classes[i];
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


//    @Override
//    public String toString() {
//        return "Student{" +
//                "classes=" + Arrays.toString(classes) +
//                ", name='" + name + '\'' +
//                '}';
//    }
}
