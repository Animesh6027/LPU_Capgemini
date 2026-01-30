import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Book {
    private int id;
    private String title;
    private String author;
    private int yearPublished;
    private int numberOfPages;

    Book(int id, String title, String author, int yearPublished, int numberOfPages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.numberOfPages = numberOfPages;
    }

    public int getID() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public String toString() {
        return "Book[ID=" + id + ", Title=" + title + ", Author=" + author +
               ", Year Published=" + yearPublished + ", Number of Pages=" + numberOfPages + "]";
    }
}
class Library {
    private List<Book> books = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }
    public List<Book> findBooksByAuthor(String author){
        return books.stream().filter(b ->b.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
    }
    public List<Book> findLatestBooks(int yearThreshold){
        return books.stream().filter(b ->b.getYearPublished() > yearThreshold).collect(Collectors.toList());
    }
    public List<Book> findBooksByComplexCriteria(int year, int minPages, String authorSubstring){
        return books.stream().filter(b->b.getYearPublished()>year).filter(b ->b.getNumberOfPages()>=minPages).filter(b->b.getAuthor().toLowerCase().contains(authorSubstring.toLowerCase())).collect(Collectors.toList());
    }
}
public class Problem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book(1, "Java", "ABC", 2000, 350));
        library.addBook(new Book(2, "Python", "DEF", 2001, 100));
        library.addBook(new Book(3,"C","IJK",2002, 400));

        System.out.println("Books by author 'ABC':");
        library.findBooksByAuthor("ABC").forEach(System.out::println);

        System.out.println("\nBooks published after 2000:");
        library.findLatestBooks(2000).forEach(System.out::println);

        System.out.println("\nComplex Filter (after 2000, min pages 200, author contains 'D')");
        library.findBooksByComplexCriteria(2000, 200, "D").forEach(System.out::println);
    }
}