package Code;

public interface IBook {

    void addBook(Book book);

    boolean updateBookById(String id);

    void displayDetails();

    double calculatePrice();
}
