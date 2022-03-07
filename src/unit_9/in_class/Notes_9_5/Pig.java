package unit_9.in_class.Notes_9_5;

public class Pig extends Animal {
    private boolean isKosher;

    public Pig(String name, boolean isKosher)
    {
        super(name);
        this.isKosher = isKosher;
    }

    /**
     * Makes a sound for a pig
     *
     */
    public void speak()
    {
        if (isKosher)
            System.out.println("The Kosher Pig " + getName() + " says OINK OINK.");
        else
            System.out.println("The NON-Kosher Pig " + getName() + " says OINK OINK.");
    }
}
