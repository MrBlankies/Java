package homework.week03;

public class Printed extends Book {

    private String cover;
    private int pages;
    private String publisher;
    private int copies;

    public Printed(int isbn, String title, String author, double price,String cover, int pages, String publisher, int copies) {
        super(isbn, title, price, author);
        this.cover = cover;
        this.pages = pages;
        this.publisher = publisher;
        this.copies = copies;
    }

    public String getCover() {
        return cover;
    }
    public int getPages() {
        return pages;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getCopies() {
        return copies;
    }
    public String getType() {
        return "Printed";
    }

    public String toString() {
        return super.toString() +
                "\nCover: " + cover +
                "\nPages: " + pages +
                "\nPublisher: " + publisher +
                "\nCopies: " + copies;
    }
}
