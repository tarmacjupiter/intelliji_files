package unit_6.lab2;

public class Questions2 {
    // Instance variables
    private String question,q1,q2,q3,q4,answer;

    // Full Constructor

    public Questions2(String question, String q1, String q2, String q3, String q4, String answer) {
        this.question = question;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.answer = answer;
    }

    //toString method
    public String toString(){
        String output = "";
        output += question + "\n";
        output += "\t"+ "A.\t" + q1 + "\n";
        output += "\t" + "B.\t" + q2 + "\n";
        output += "\t" + "C.\t" + q3 + "\n";
        output += "\t" + "D.\t" + q4 + "\n";
        return output;
    }


    // Setters and Getters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getQ4() {
        return q4;
    }

    public void setQ4(String q4) {
        this.q4 = q4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
