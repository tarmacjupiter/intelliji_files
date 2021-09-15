package unit_3.examples;

public class Pizza {

    //instance variables
    private String store;
    private int inches;
    private int numToppings;
    private boolean isDeepDish;


    //full constructor
    public Pizza(String storeName, int inch, int toppingsNum, boolean deepDish){
        store = storeName;
        inches = inch;
        numToppings = toppingsNum;
        isDeepDish = deepDish;
    }

    //default constructor
    public Pizza(){
        store = "N/A";
        inches = 8;
        numToppings = 0;
        isDeepDish = false;
    }

    //GETTERS
    public String getStore() {
        return store;
    }

    public int getInches() {
        return inches;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    //SETTERS

    public void setStore(String store) {
        this.store = store;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }

    /*
    .equals method

        same size, same toppings, same type

     COMPOUND COMPARISONS
        and (&&) or (||)

     */

    public boolean equals(Pizza otherPizza){
        if (this.inches == otherPizza.getInches() && this.numToppings == otherPizza.getNumToppings() && this.isDeepDish == otherPizza.isDeepDish()){
            return true;
        }
        else { //otherwise
            return false;
        }
    }

    /*

    PRINT THE INFO FOR ANY INSTANCE OF PIZZA

     */

    public void printInfo(){
        System.out.println("Store: " + store);
        System.out.println("Inches: " + inches);
        System.out.println("# of Toppings: " + numToppings);
        System.out.println("Is it deep dish?: " + isDeepDish);
    }
}
