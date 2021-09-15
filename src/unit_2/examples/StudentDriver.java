package unit_2.examples;

public class StudentDriver {
    public static void main(String[] args) {
        // Instantiate an object (building an instance of the object)
        Student anthonyB = new Student();

        // Instantiate a second object
        Student mrsDenna = new Student("Mrs.", "Denna", 12, 4.33);

        //Instantiate a third object
        Student jackson = new Student("Jackson", "Smith");

        //Print object information
        anthonyB.printInfo();

        mrsDenna.printInfo();

        jackson.printInfo();

        //Change grade level and GPA

        anthonyB.setGPA(6.00);

        anthonyB.setGradeLevel(12);

        System.out.println("_________________________");

        //Print object information
        anthonyB.printInfo();

        mrsDenna.printInfo();

        jackson.printInfo();

        //Create output sentence to print

        String firstName = anthonyB.getfName();

        System.out.println("Hello " + firstName + " " + anthonyB.getlName());

        System.out.println("Welcome to " + anthonyB.getGradeLevel() + "th grade!");
    }
}
