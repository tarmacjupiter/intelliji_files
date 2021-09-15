package unit_3.examples;

public class PizzaDriver {
    public static void main(String[] args) {
        //instantiate several Pizza options

        Pizza lous = new Pizza("Lou's", 14, 5, true);

        Pizza jacks = new Pizza("Jacks", 14, 1, false);

        Pizza georgios = new Pizza("Georgio's", 14, 5, true);

        Pizza costco = new Pizza("Costco", 18, 3, false);


        System.out.println("Comparing Lou's and Jacks");
        boolean lToJ = lous.equals(jacks);
        System.out.println("Lou's to Jacks: " + lToJ);

        System.out.println();

        System.out.println("Lou's to Georgio's");
        boolean ltoG = lous.equals(georgios);
        System.out.println("Lou's to Georgio's: " + ltoG);

    }
}
