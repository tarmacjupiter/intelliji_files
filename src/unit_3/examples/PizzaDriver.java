package unit_3.examples;

public class PizzaDriver {
    public static void main(String[] args) {
        //instantiate several Pizza options

        Pizza lous = new Pizza("Lou's", 14, 5, true);

        Pizza jacks = new Pizza("Jacks", 14, 1, false);

        Pizza georgios = new Pizza("Georgio's", 14, 5, true);

        Pizza costco = new Pizza("Costco", 18, 3, false);


        //Comparing Lous to Jacks
        System.out.println("Comparing Lou's and Jacks");
        boolean lToJ = lous.equals(jacks);
        System.out.println("Lou's to Jacks: " + lToJ);

        System.out.println();

        //Compaging Lous to Gerogios
        System.out.println("Lou's to Georgio's");
        boolean ltoG = lous.equals(georgios);
        System.out.println("Lou's to Georgio's: " + ltoG);

        System.out.println();

        //Comparing Costco inches to Georgios inches
        System.out.println("Comparing Costco inches to Georgios inches");
        System.out.println(costco.compareTo(georgios));

        System.out.println();

        // Comparing Georgios inches to Costco inches
        System.out.println("Comparing Georgios inches to Costco inches");
        System.out.println(georgios.compareTo(costco));

        System.out.println();

        //Comparing Jacks inches to Lous inches
        System.out.println("Comparing Jacks inches to Lous inches");
        System.out.println(jacks.compareTo(lous));
        System.out.println();

        //toString methods
        System.out.println(jacks.toString());

    }
}
