package unit_5.examples.marvel;

public class Power {

    // Instance variables
    private String name;
    private int strength;

    // Full Constructor
    public Power(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


}
