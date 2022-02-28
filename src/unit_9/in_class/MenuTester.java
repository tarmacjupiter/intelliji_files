package unit_9.in_class;

public class MenuTester {
    public static void main(String[] args) {
        MenuItem m = new MenuItem("Basic pizza");
        System.out.println();
        Entree e = new Entree("Rib platter", 3);
        System.out.println();
        Drink d = new Drink(16, false);
        System.out.println();
        Drink d2 = new Drink(16, true);
    }
}
