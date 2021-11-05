package unit_5.parameters;

public class Dog {
    //instance variables
    private String name;
    private int age;

    // Static variables
    public void addDogYears(int age){
        age += 7;
        System.out.println(age);
    }

    // Full Constructor

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString() method

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
