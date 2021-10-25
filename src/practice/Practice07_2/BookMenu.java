package practice.Practice07_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    // In-memory storage
    static List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        boolean isContinuing = true;
        int retryCounter = 0;

        while (isContinuing) {
            if (retryCounter == 3) {
                System.out.println("Exceed retry time!");
                break;
            }
            System.out.println("=====menu====");
            System.out.println("1. Add Book");
            System.out.println("2. Retrieve Book(ISBN)");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            int userOption = scanner.nextInt();
            switch (userOption) {
                case 0:
                    System.out.println("exit");
                    isContinuing = false;
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    retrieveBook();
                    break;
                default:
                    System.out.println("Wrong option!");
                    retryCounter++;
            }
        }
    }

    private static void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Book ISBN: ");
        String ISBN = scanner.nextLine();
        System.out.print("Book title: ");
        String bookTitle = scanner.nextLine();
        System.out.print("Book author name: ");
        String authorName = scanner.nextLine();

        Book book = new Book(ISBN, bookTitle, authorName);
        bookList.add(book);
    }

    private static void retrieveBook() {
        //TODO:Cover logic when Booklist is empty
        if (bookList.isEmpty()) {
            System.out.println("No Book");
            return;
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Book ISBN: ");
        String ISBN = scanner.nextLine();
        Book returnBook = null;

        for (Book book : bookList) {
            if (book.getISBN().equals(ISBN)) {
                returnBook = book;
                break;
            }
        }

        if (returnBook != null) {
            System.out.println(returnBook);
        } else System.out.println("No Book search result!");
    }
}
