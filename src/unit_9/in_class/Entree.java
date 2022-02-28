package unit_9.in_class;

public class Entree extends MenuItem{
    private int numSides;
    public Entree(String name, int numSides) {
        super(name);
        this.numSides = numSides;
        System.out.println("Created an Entree with " + numSides + " sides");
    }

}
