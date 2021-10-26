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

        SuperHero superman = new SuperHero("Superman", new Power("Super Strength", 100));

        // Initial Printout
        System.out.println("Name: " + hulk.getName());

        System.out.println("Power: ");
        System.out.println("\tName: " + hulk.getPower().getName());
        System.out.println("\tStrength: " + hulk.getPower().getStrength());

        superStrength.setStrength(150);

        System.out.println();

        //Change strength variable of superstrength
        System.out.println("Name: " + superman.getName());

        System.out.println("Power: ");
        System.out.println("\tName: " + superman.getPower().getName());
        System.out.println("\tStrength: " + superman.getPower().getStrength());

        System.out.println();

        //Battle between Loki and the Hulk
        // Set up if else if statement comparing Loki and Hulk's Power Strength
        if(superStrength.getStrength() > loki.getPower().getStrength()){
            System.out.println("The Hulk beats Loki into a pulp");
        } else if (superStrength.getStrength() < loki.getPower().getStrength()){
            System.out.println("Loki outwits The Hulk and destroys him");
        }else{
            System.out.println("After a hard battle The Hulk and Loki have exhausted themselves");
        }

    }
}
