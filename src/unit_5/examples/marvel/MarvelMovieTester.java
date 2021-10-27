package unit_5.examples.marvel;

public class MarvelMovieTester{
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
        System.out.println(hulk);
        // Can do System.out.println(hulk.toString());

        superStrength.setStrength(150);

        System.out.println();

        //Change strength variable of superstrength
        System.out.println(superman);

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
    public static void battle(SuperHero goodGuy, Villain badGuy){
        while(goodGuy.getHealth() >= 0 && badGuy.getHealth() >= 0){
            boolean heroHit = Math.random() < 0.5;      // [0, 0.5) is a hit
            boolean villainHit = Math.random() < 0.5;   // [0, 0.5) is a hit

            if(heroHit){
                badGuy.setHealth(badGuy.getHealth() - goodGuy.getPower().getStrength());
            }
            if(villainHit){
                goodGuy.setHealth(goodGuy.getHealth() - badGuy.getPower().getStrength());
            }
        }
    }
}
