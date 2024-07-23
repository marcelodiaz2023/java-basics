// import java.lang.Math;
import java.util.Random;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.ISBN = generateISBN();
    }

    private String generateISBN(){
        BookNumber newISBN = new BookNumber();
        return newISBN.code();
    }

    public String getISBN(){
        return this.ISBN;
    }
    
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title; 
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public static void main(String[] args){
        Book newBook1 = new Book("Atomic Habits", "James Clear");
        System.out.println(newBook1.title);
        System.out.println(newBook1.author);
        System.out.println(newBook1.ISBN);
    }
}
