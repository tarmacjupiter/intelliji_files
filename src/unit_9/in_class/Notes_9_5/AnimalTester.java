package unit_9.in_class.Notes_9_5;

/**
 * Lesson 7-5: Polymorphism
 * The purpose of this tester class is to see what happens when an array
 * of Animal references is assigned objects of type Animal, Pig, and Cow
 *
 * @author   Mrs. Denna
 */

public class AnimalTester {
    public static void main(String[] args) {
        Animal[] barn = new Animal[6];
        // 1. What data type does this array hold?
        // This array holds Animal Objects

        barn[0] = new Animal("Murphy");
        barn[1] = new Cow("Daisy", "Dairy");
        barn[2] = new Pig("Wilbur", false);
        barn[3] = new Cow("Billy", "Beef");
        barn[4] = new Animal("Maggie");
        barn[5] = new Pig("Max", true);

        // 2. Did I ONLY store Animal objects in this array?  If not, why do you
        //    think this was allowed?
        // You stored sub-classes of the parent class "Animal", such as Cow and Pig
        // this is allowed because these sub-classes inherit the parent classes


        int numAnimals = 0, numPigs = 0, numCows = 0;

        for (Animal a : barn) {
            if(a instanceof Pig){
                numPigs++;
            } else if(a instanceof Cow){
                numCows++;
            } else if(a != null){
                numAnimals++;
            }
            a.speak();
        }

        System.out.println("Number of Animals:\t" + numAnimals);
        System.out.println("Number of Pigs:\t" + numPigs);
        System.out.println("Number of Cows:\t" + numCows);
        // 3. What method is getting called here?  The speak method of the Animal class?

        // The method getting called depends on the object in the array, if it is just an
        // animal class the method from the animal class gets called, if it is from the
        // cow or pig classes, those respective methods get called.

        // 4. Try to summarize in 2-3 sentences WHAT you observed in this code.

        // Polymorphism is a way to change objects to make them take different forms and for
        // them to have the same method names, but inherently do different things.
    }
}
