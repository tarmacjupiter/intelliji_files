package unit_5.examples.marvel;

public class Villain {
    // Instance Variables
    private String name;
    private Power power;

    // Full Constructor
    public Villain(String name, Power power){
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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
