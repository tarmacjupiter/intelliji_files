//package unit_7.in_class.searches;
//
//public class StoreTester {
//    public static void main(String[] args) {
//        Item a = new Item("Milk", 1.99, 10);
//        Item b = new Item("Vegetable Oil", 2.50, 8);
//        Item c = new Item("Milk", 1.99, 5);
//        Item d = new Item("Flour", 1.85, 2);
//        Item e = new Item("Eggs", 0.75, 15);
//        Item f = new Item("Sugar", 3.99, 5);
//        Item g = new Item("Eggs", 0.75, 2);
//
//        // adds all Item objects to an array of Item objects
//        Item[] itemsToAdd = {a, b, c, d, e, f, g};
//
//        Store bakedGoods = new Store();
//
//        // For every Item in the array, try adding it to the stock OR update its
//        // quantity.  Display a message after every item saying what was added to stock OR
//        // what item has ___ added to stock
//
//        for (Item i: itemsToAdd) {
//            if (bakedGoods.updateStock(i))
//                System.out.println(i.getName() + " added to stock");
//            else
//                System.out.println(i.getName() + " updated quantity in stock to " + i.getQuantity());
//        }
//
//        // print all inventory by automatically invoking the toString of the Store class
//
//        System.out.println();
//        System.out.println(bakedGoods);
//    }
//}
