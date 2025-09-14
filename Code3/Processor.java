package Code;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add new TextBook");
            System.out.println("2. Add new ReferenceBook");
            System.out.println("3. Update book by id");
            System.out.println("4. Delete book by id");
            System.out.println("5. Find book by id");
            System.out.println("6. Display all books");
            System.out.println("7. Find the most expensive book");
            System.out.println("8. Count books by type");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String tid = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String ttitle = sc.nextLine();
                    System.out.print("Enter Base Price: ");
                    double tprice = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Subject: ");
                    String subject = sc.nextLine();
                    bookList.addBook(new TextBook(tid, ttitle, tprice, subject));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    String rid = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String rtitle = sc.nextLine();
                    System.out.print("Enter Base Price: ");
                    double rprice = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Publisher: ");
                    String publisher = sc.nextLine();
                    bookList.addBook(new ReferenceBook(rid, rtitle, rprice, publisher));
                    break;

                case 3:
                    System.out.print("Enter book ID to update: ");
                    String uid = sc.nextLine();
                    if (bookList.updateBookById(uid)) {
                        System.out.println("Book updated!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter book ID to delete: ");
                    String did = sc.nextLine();
                    if (bookList.deleteBookById(did)) {
                        System.out.println("Book deleted!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter book ID to find: ");
                    String fid = sc.nextLine();
                    Book found = bookList.findBookById(fid);
                    if (found != null) {
                        found.displayDetails();
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 6:
                    bookList.displayAllBooks();
                    break;

                case 7:
                    Book expensive = bookList.findMostExpensiveBook();
                    if (expensive != null) {
                        System.out.println("Most expensive book:");
                        expensive.displayDetails();
                    } else {
                        System.out.println("No books available!");
                    }
                    break;

                case 8:
                    bookList.countBooks();
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
