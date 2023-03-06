package HW_1;


import java.sql.Array;

public class Book {
     String title;
     int pages;
     Array Authors;
     String genre;

     public Book(){

     }

    public Book(String title, int pages,
                Array Authors, String genre) {
        this.title = title;
        this.pages = pages;
        this.Authors = Authors;
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", Authors=" + Authors +
                ", genre='" + genre + '\'' +
                '}';
    }
}