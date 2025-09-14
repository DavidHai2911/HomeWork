package Code;

import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> bookList;

    public BookList() {
        bookList = new ArrayList<>();
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public boolean updateBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id)) {
                // giả sử chỉ update title tạm
                b.setTitle(b.getTitle() + " (Updated)");
                return true;
            }
        }
        return false;
    }

    public boolean deleteBookById(String id) {
        return bookList.removeIf(b -> b.getId().equals(id));
    }

    public Book findBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        for (Book b : bookList) {
            b.displayDetails();
            System.out.println("----------------");
        }
    }

    public Book findMostExpensiveBook() {
        if (bookList.isEmpty()) {
            return null;
        }
        Book max = bookList.get(0);
        for (Book b : bookList) {
            if (b.calculatePrice() > max.calculatePrice()) {
                max = b;
            }
        }
        return max;
    }

    public void countBooks() {
        int textCount = 0, refCount = 0;
        for (Book b : bookList) {
            if (b instanceof TextBook) {
                textCount++;
            } else if (b instanceof ReferenceBook) {
                refCount++;
            }
        }
        System.out.println("Total TextBooks: " + textCount);
        System.out.println("Total ReferenceBooks: " + refCount);
    }
}
