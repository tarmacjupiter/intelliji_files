package unit_9.in_class;

public class MenuItem {
    private String name;

    public MenuItem() {
        name = "none given";
        System.out.println("Created a MenuItem without a name?!?!?");
    }

    public MenuItem(String name) {
        this.name = name;
        System.out.println("Created a MenuItem called " + name);
    }
}
