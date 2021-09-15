package unit_2.practice_programming_quiz;

public class Toy {
    // *** WRITE CODE HERE ***
    // Part A
    // Create instance variables for the toy name and price
    private String name;
    private double price;

    // *** WRITE CODE HERE ***
    // Part B
    // Create getters & setters for all instance variables

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double cost) {
         price = cost;
    }

    public void setName(String newName){
        name = newName;
    }


    // *** WRITE CODE HERE ***
    // Part C
    // Create a full constructor that accepts each instance
    // variable as a parameter

    public Toy(String newName, double newPrice){
        name = newName;
        price = newPrice;
    }


    // *** WRITE CODE HERE ***
    // Part D
    // Create a calcTotal method that adds a 10% tax to the
    // price and returns the total cost

    public double calcTotal(){
        double tax = price * .10;
        double result = tax + price;

        return result;
    }

}
