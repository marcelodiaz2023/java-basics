
import java.util.ArrayList;
import java.util.stream.Collectors;

public class BookCollection {
    private ArrayList<Book> collection;

    public BookCollection(){
        this.collection = new ArrayList<Book>();
    }
    public void add(Book book){  
        this.collection.add(book);
    }

    public ArrayList<Book> getCollection(){
        return this.collection;
    }

    public String printCollection(){
        String collectionString = "";
        for(Book b:this.collection){
            collectionString += String.format("%-18s : %s by %s%n", b.getISBN(), b.getTitle(), b.getAuthor());
        }
        return collectionString;
    }

    public void remove(String ISBN) {
        this.collection = this.collection.stream()
                            .filter(item -> !(item.getISBN().equals(ISBN)))
                            .collect(Collectors.toCollection(ArrayList::new));
    }
}
