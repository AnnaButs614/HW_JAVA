package HW_1;


import java.sql.Array;
import java.util.Arrays;

public class Book {
     String title;
     int pages;
     String Authors[] = new String[1];
     String genre;

     public Book(){

     }

    public Book(String title, int pages, String[] authors, String genre) {
        this.title = title;
        this.pages = pages;
        Authors = authors;
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", Authors=" + Arrays.toString(Authors) +
                ", genre='" + genre + '\'' +
                '}';
    }
}