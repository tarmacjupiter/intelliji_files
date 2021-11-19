package unit_6.in_class;

public class Course {
    // Instance Variables
    private String teacher;
    private String grade;
    private String subject;
    private int period;

    // Full Constructor

    public Course(String teacher, String grade, String subject, int period) {
        this.teacher = teacher;
        this.grade = grade;
        this.subject = subject;
        this.period = period;
    }

    // Partial Constructor


    public Course(String subject, int period) {
        this.teacher = "None";
        this.grade = "-";
        this.subject = subject;
        this.period = period;
    }
    /**
     * a to String method returning a string of all the Course data
     * @return a String containing the teaccher,grade,subject, and period of a Course object
     */
//    public String toString(){
//
//    }
}
