package unit_9.in_class.Notes_9_5;

public class Animal {
    private String name;

    public Animal(String name)
    {
        this.name = name;
    }

    /**
     * Makes a sound for the specific animal type
     *
     */
    public void speak()
    {
        System.out.println("The Animal " + name + " makes a sound.");
    }

    public void running(){
        System.out.println("The animal " + name + " is running!");
    }

    public String getName()
    {
        return name;
    }
}
