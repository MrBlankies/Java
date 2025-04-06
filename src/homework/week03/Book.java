package homework.week03;

public class Book {
    protected int isbn;
    protected String title;
    protected double price;
    protected String author;

    public Book(int isbn, String title, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.author = author;
    }


    public int getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public String getAuthor() {
        return author;
    }

    public String getType() {
        return "Book";
    }


    public String toString() {
        return "ISBN: " + isbn +
                "\nTitle: " + title +
                "\nAuthor: " + author +
                "\nPrice: $" + price;
    }

}
