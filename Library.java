import java.util.Scanner;

public class Library {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BookCollection collection = new BookCollection();
        String name = "";
        String author = "";
        String ISBN = "";
        int key = 0;

        s.useDelimiter("\n");

        while (key != 3) {
            ClearScreen();
            System.out.println("Welcome to the Library");
            System.out.println("[1]=Add Book, [2]=Remove Book, [3]=Exit \n");
            System.out.println(collection.printCollection());

            System.out.print("What do you want to do(insert key)?  ");
            key = s.nextInt();

            switch (key) {
                case 1:
                    // add book
                    System.out.print("Name of the Book: ");
                    name = s.next();
                    System.out.print("Author: ");
                    author = s.next();

                    Book bookEntry = new Book(name, author);
                    collection.add(bookEntry);
                    break;
                case 2:
                    System.out.print("Enter ISBN: ");
                    ISBN = s.next();
                    collection.remove(ISBN);
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }

    }
    private static void ClearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
