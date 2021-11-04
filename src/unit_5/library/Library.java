package unit_5.library;

public class Library {
    public static void main(String[] args) {
        // Call static method
        Book.bookSummary();

        // Create Book Objects
        Book The_Stranger = new Book("The Stranger", "Albert Camus", "Fiction", "Some random company", 140, 1941);

        Book harryPotter1 = new Book("Harry Potter 1", "J.K. Rowling", "Fantasy", "Penguin", 275, 1997);

        Book Lord_Of_The_Rings = new Book("LOTR1", "J.R.R. Tolkien", "Fantasy", "Allen", 304, 1954);

        // Printouts
        System.out.println(harryPotter1);
        System.out.println(The_Stranger);
        System.out.println(Lord_Of_The_Rings);
    }
}
