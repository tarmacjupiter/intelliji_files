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

        //Create a second Villain object
        Villain venom = new Villain("Venom", new Power("Hungry", 200));

        // Initial Printout
        System.out.println(hulk);
        // Can do System.out.println(hulk.toString());

        superStrength.setStrength(150);

        System.out.println();

        //Change strength variable of superstrength
        System.out.println(superman);

        //Call calcAvgStrength() method
        SuperHero.calcAvgStrength();

        System.out.println();

        //Battle between The Hulk and Loki
        battle(hulk, loki);
        battle(superman, venom);

    }

    /**
     * Has a Battle between two classes, SuperHero class and Villain class, then prints out who has won
     * @param goodGuy the SuperHero object
     * @param badGuy the Villain object
     */
    public static void battle(SuperHero goodGuy, Villain badGuy) {
        while (goodGuy.getHealth() != 0 && badGuy.getHealth() != 0) {
            boolean heroHit = Math.random() < 0.5;      // [0, 0.5) is a hit
            boolean villainHit = Math.random() < 0.5;   // [0, 0.5) is a hit
            //Hero hits the Villain
            if (heroHit) {
                System.out.println(goodGuy.getName() + " punches " + badGuy.getName() + " in the face!");
                badGuy.setHealth(badGuy.getHealth() - goodGuy.getPower().getStrength());
                if(badGuy.getHealth() < 0){
                    badGuy.setHealth(0);
                }
            }
            //Villain hits the Hero
            if (villainHit) {
                System.out.println(badGuy.getName() + " stabs " + goodGuy.getName() + "!");
                goodGuy.setHealth(goodGuy.getHealth() - badGuy.getPower().getStrength());
//                goodGuy.getTotalHeroHealth(goodGuy.getTotalHeroHealth() - badGuy.getHealth());
                if(goodGuy.getHealth() < 0){
                    goodGuy.setHealth(0);
                }
            }

            if(!villainHit && !heroHit){
                System.out.println("Both " + goodGuy.getHealth() + " and " + badGuy.getName() + " have missed!");
            }

            System.out.println("Hero's Heath:\t\t" + goodGuy.getHealth());
            System.out.println("Villain's Health:\t" + badGuy.getHealth());
            System.out.println();
        }
        //someone has lost the battle, check for a winner
        if(badGuy.getHealth() == 0){
            System.out.println(goodGuy.getName() + " has won!");
        }else{
            System.out.println(badGuy.getName() + " has won...");
        }
    }
}