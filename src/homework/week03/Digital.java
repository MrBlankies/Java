package homework.week03;

public class Digital extends Book {

    private int size;

    public Digital(int isbn, String title, String author, double price, int size) {
        super(isbn, title, price, author);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return "Digital";
    }

    public String toString() {
        return super.toString() +
                "\nSize: " + size + "kbs";
    }
}
