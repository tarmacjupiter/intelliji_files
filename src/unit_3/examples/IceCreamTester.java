package unit_3.examples;

public class IceCreamTester {
    public static void main(String[] args) {
        IceCream bob = new IceCream("Rocky Road", 3, true);
        IceCream sha = new IceCream("Mint Chip", 2, false);
        IceCream aubrey = new IceCream("Mint Chip", 2, false);
        IceCream riley = bob;

        // How many variable references have I made?
        // 4 Reference Variables


        // How many objects have I instantiated?
        // We created/instantiated 3 IceCream objects

        // Write in comments what you think the output would be THEN run
        // the code to see if you are correct
        System.out.println(bob.equals(sha));        //false
        System.out.println(aubrey.equals(sha));     //true
        System.out.println(bob.equals(riley));      //true
        System.out.println(aubrey == sha);          //false
        System.out.println(riley == bob);           //true
        System.out.println(sha == riley);           //false

        System.out.println(bob.compareTo(sha));     // (positive, out of order) 1
        System.out.println(aubrey.compareTo(bob));  // (negative, in order) -1
        System.out.println(aubrey.compareTo(sha));  // (same number) 0
    }
}

