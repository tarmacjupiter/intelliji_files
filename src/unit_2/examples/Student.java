package unit_2.examples;

public class Student {

    // private String fname;
    // private String lname;

    // Instance variables (comes with every single object we create)
    private String fName, lName;
    private int gradeLevel;
    private double gpa;

    // Default constructor - no parameters
    public Student() {
        fName = "Anthony";
        lName = "Behery";
        gradeLevel = 9;
        gpa = 0.0;
    }

    // Full constructor - accept every instance variable as a parameter
    public Student(String firstName, String LastName, int grade, double gradeAvg) {
        fName = firstName;
        lName = LastName;
        gradeLevel = grade;
        gpa = gradeAvg;
    }

    // Full constructor - accept every instance variable as a parameter (DIFFERENT
    // ORDER)
    public Student(double gradeAvg, String firstName, String LastName, int grade) {
        fName = firstName;
        lName = LastName;
        gradeLevel = grade;
        gpa = gradeAvg;
    }

    // Partial constructor - accepts SOME instance variables as parameters
    public Student(String firstName, String lastName) {
        fName = firstName;
        lName = lastName;
        gradeLevel = 9; // Default values
        gpa = 0.0; // Default values
    }

    //METHODS BELOW CONSTRUCTORS

    //Print out information for student object
    public void printInfo(){
        System.out.println("Student Name: " + fName + " " + lName);
        System.out.println("Student Grade: " + gradeLevel);
        System.out.println("Student GPA: " + gpa);
    }

    //SETTER METHODS - change the values of instance variables

    //Setter method for gpa
    public void setGPA(double newGPA){
        gpa = newGPA;
    }

    //Setter method for grade level
    public void setGradeLevel(int newGradeLvl){
        gradeLevel = newGradeLvl;
    }

    //GETTER METHODS (return (get) data)

    //Return first name
    public String getfName() {
        return fName;
    }
    //return last name
    public String getlName() {
        return lName;
    }
    //return grade level
    public int getGradeLevel() {
        return gradeLevel;
    }
    //return grade point average
    public double getGpa() {
        return gpa;
    }
}
