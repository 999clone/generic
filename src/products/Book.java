package products;

public class Book extends Product {
    private String author;
    private String publication;
    private String genre;
    public static int UUID = 0;

    public Book(String title, double price,  String author, String publication, String genre) {
        super(title, price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublication() {
        return publication;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    protected String generateId() {
        UUID++;
        return "1" + UUID;
    }
    @Override
    public String toString() {
        return super.toString() + ", Author: " + author + ", Publication: " + publication + ", Genre: " + genre;
    }
}
