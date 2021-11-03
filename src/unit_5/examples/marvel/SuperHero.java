package unit_5.examples.marvel;

public class SuperHero {
    // Instance Variables
    private String name;
    private Power power;
    private int health;


    //Static Variables
    private static int totalNumHeroes = 0;
    private static int totalHeroHealth = 0;
    private static int totalHeroStrength = 0;

    // Full Constructor

    public SuperHero(String name, Power power){
        this.name = name;
        this.power = power;
        this.health = 1000;
        totalNumHeroes++;
        System.out.println("Total Number SuperHeroes: " + totalNumHeroes);
        totalHeroHealth += 1000;
        System.out.println("Total Hero Health: " + totalHeroHealth);
        totalHeroStrength += power.getStrength();
        System.out.println();
    }

    /**
     * This method returns a String of the SuperHero's name, power, power name, and strength
     * @return the output sentence with details about a SuperHero
     */
    public String toString(){
        String output = "";
        output += "SuperHero's Name:\t" + name + "\n";
        output += "SuperHero's Health:\t" + health + "\n";
        output += "SuperHero's Power:\n";
        output += "\tName:\t\t\t" + power.getName() + "\n";
        output += "\tStrength:\t\t" + power.getStrength() + "\n";
        return output;
    }

    // Static method to calculate the average of SuperHero strength
    public static void calcAvgStrength(){
        double avg = (double)totalHeroStrength / totalNumHeroes;
        System.out.println("Average Strength: " + avg);
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

    public static int getTotalNumHeroes() {
        return totalNumHeroes;
    }

    public static void setTotalNumHeroes(int totalNumHeroes) {
        SuperHero.totalNumHeroes = totalNumHeroes;
    }

    public static int getTotalHeroHealth() {
        return totalHeroHealth;
    }

    public static void setTotalHeroHealth(int totalHeroHealth) {
        SuperHero.totalHeroHealth = totalHeroHealth;
    }

    public static int getTotalHeroStrength() {
        return totalHeroStrength;
    }

    public static void setTotalHeroStrength(int totalHeroStrength) {
        SuperHero.totalHeroStrength = totalHeroStrength;
    }
}
