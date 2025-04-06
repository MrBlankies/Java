package homework.week03;

public class Audiobook extends Book {

    private int duration;
    private  String narrator;

    public Audiobook(int isbn, String title, String author, double price, int duration, String narrator) {
        super(isbn, title, price, author);
        this.duration = duration;
        this.narrator = author;
    }

    public int getDuration() {
        return duration;
    }
    public String getNarrator() {
        return narrator;
    }
    public String getType() {
        return "Audiobook";
    }

    public String toString() {
        return super.toString() +
                "\nDuration: " + duration + " minutes" +
                "\nNarrator: " + narrator;
    }
}
