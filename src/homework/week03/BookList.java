package homework.week03;

import java.util.ArrayList;

public class BookList {
    private ArrayList<Book> Books;

    public BookList() {
        Books = new ArrayList<>();

        Books.add(new Printed(111, "Python", "John Doe", 19.99, "Hardcover", 300, "Alice Smith", 10));
        Books.add(new Printed(112, "Java", "David Ron", 14.99, "Paperback", 250, "Peter Fern", 5));
        Books.add(new Printed(113, "Database", "Mary Lee", 24.99, "Hardcover", 500, "James Johnson", 20));
        Books.add(new Digital(114,"Web Development", "Sarah Green", 9.99, 143));
        Books.add(new Audiobook(115, "History", "Mike Brown", 29.99, 37, "Donald Smith"));
    }

    public void displayBooks(String type) {
        for (Book book : Books) {
            if (book.getType().equals(type)) {
                System.out.println(book);
                System.out.println("---------");
            }
        }
    }
}
