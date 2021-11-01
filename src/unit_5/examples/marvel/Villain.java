package unit_5.examples.marvel;

public class Villain {
    // Instance Variables
    private String name;
    private Power power;
    private int health;

    // Full Constructor
    public Villain(String name, Power power){
        this.name = name;
        this.power = power;
        this.health = 1000;
    }

    /**
     * This method returns a String of the Villain's name, power, power name, and strength
     * @return the output sentence with details about a Villain
     */
    public String toString(){
        String output = "";
        output += "Villain's Name:\t" + name + "\n";
        output += "Villain's Health:\t" + health + "\n";
        output += "Villain's Power:\n";
        output += "\tName:\t\t" + power.getName() + "\n";
        output += "\tStrength:\t" + power.getStrength() + "\n";
        return output;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
