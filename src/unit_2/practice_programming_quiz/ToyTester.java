package unit_2.practice_programming_quiz;

public class ToyTester {
    public static void main(String[] args) {
        Toy myTruck = new Toy("Tonka", 9.99);

        double total = myTruck.calcTotal();

        String toyName = myTruck.getName();


        System.out.println("Your toy: " + toyName);
        System.out.println("Price: " + "$" + total);
    }
}
