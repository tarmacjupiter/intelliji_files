package unit_5.library;

import java.util.Locale;

public class Book {
    // Instance variables
    private String title, author, genre, publisher, dewey;
    private int numPages, releaseYear;

    // Static variable(s)
    private static int nextBookNum = 1;

    // Full Constructor

    public Book(String title, String author, String genre, String publisher, int numPages, int releaseYear) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.numPages = numPages;
        this.releaseYear = releaseYear;
        this.dewey = author.substring(0, 3) + nextBookNum;
        nextBookNum++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", dewey='" + dewey + '\'' +
                ", numPages=" + numPages +
                ", releaseYear=" + releaseYear +
                '}';

    }

    public static void bookSummary(){
        System.out.println("Next Book Num: " + nextBookNum);
    }
}