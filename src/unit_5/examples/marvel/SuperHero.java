package unit_5.examples.marvel;

public class SuperHero {
    // Instance Variables
    private String name;
    private Power power;

    // Full Constructor
    public SuperHero(String name, Power power){
        this.name = name;
        this.power = power;
    }

    // Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Power getPower() {
        return power;
    }

    public void setPower(Power power) {
        this.power = power;
    }
}
