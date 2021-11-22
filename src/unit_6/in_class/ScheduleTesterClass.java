package unit_6.in_class;

public class ScheduleTesterClass {
    public static void main(String[] args) {
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
    }
}
