package unit_2.programming_quiz;

public class QuizDriver
{
    public static void main(String[] args)
    {
        // Create default popQuiz and customized unit2Quiz objects
        Quiz popQuiz = new Quiz();
        Quiz unit2Quiz = new Quiz("M359 Unit 2 Quiz", 4,true);

        // Print pop quiz information
        popQuiz.printInfo();
        System.out.println();

        // Add two MC's to popQuiz
        popQuiz.addMC(2);

        // *** WRITE CODE HERE ***
        // Part I
        // Calculate popQuiz total points with 1 point per MC
        // Store in an appropriate variable

        double popQuizCalcTotal = popQuiz.calcTotal(popQuiz.getQuestions());

        // *** WRITE CODE HERE ***
        // Part J
        // Print popQuiz information along with total points
        // Ex:  QUIZ NAME
        //          Number MC's:    #
        //          Has EC:      true/false
        //          Total Points:   #

        popQuiz.printInfo();
        System.out.println("Total Points:   " + popQuizCalcTotal);

        // Print unit2Quiz information
        System.out.println();
        unit2Quiz.printInfo();
        System.out.println();

        // Change unit2Quiz name to M359 Unit 2 Programming Quiz
        unit2Quiz.setName("M359 Unit 2 Programming Quiz");

        // *** WRITE CODE HERE ***
        // Part K
        // Calculate unit2Quiz total points with 3 point per MC
        // Store in an appropriate variable

        double unit2QuizPointTotal = unit2Quiz.calcTotal(unit2Quiz.getQuestions());


        // *** WRITE CODE HERE ***
        // Part L
        // Calculate unit2Quiz extra credit
        // Store in an appropriate variable

        double unit2QuizEC = unit2Quiz.calcExtraCredit();


        // *** WRITE CODE HERE ***
        // Part M
        // Print unit2Quiz information along with total points
        // Ex:  QUIZ NAME
        //          Number MC's:    #
        //          Has EC:         true/false
        //          Extra Credit:   #
        //          Total Points:   # (includes extra credit)

        unit2Quiz.printInfo();
        System.out.println("Extra Credit:    " + unit2QuizEC);
        System.out.println("Total Points:    " + unit2QuizPointTotal);


        // *** EXTRA CREDIT ***
        // Uncomment the following code segment once you complete
        // the extra credit method in Quiz.java
        System.out.println();
        System.out.println(unit2Quiz.returnsLastName("Anthony Behery"));
    }
}