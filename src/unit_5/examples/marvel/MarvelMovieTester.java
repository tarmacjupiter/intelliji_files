package unit_5.examples.marvel;

public class MarvelMovieTester {
    public static void main(String[] args) {
        //Create a Power Object
        Power superStrength = new Power("Super Strength", 100);

        // Create a SuperHero Object
        SuperHero hulk = new SuperHero("The Hulk", superStrength);

        //Create a Villain Option
        Villain loki = new Villain("Loki", new Power("Magic", 140));

        // Create a second SuperHero object

        SuperHero superman = new SuperHero("Superman", superStrength);

        // Initial Printout
        System.out.println("Name: " + hulk.getName());

        System.out.println("Power: ");
//        System.out.println("\tName: " + hulk.getPower().);
//        System.out.println("\tName: " + hulk.);

    }
}
