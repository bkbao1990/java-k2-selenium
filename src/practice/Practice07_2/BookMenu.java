package practice.Practice07_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    // In-memory storage
    static List<Book> bookList = new ArrayList<>();
    public static void main(String[] args) {
        boolean isContinuing = true;
        while (isContinuing) {
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
            }
        }


    }

    private static void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Book ISBN :");
        String ISBN = scanner.nextLine();
        System.out.print("Book title :");
        String bookTitle = scanner.nextLine();
        System.out.print("Book author name :");
        String authorName = scanner.nextLine();

        Book book = new Book(ISBN,bookTitle,authorName);
        bookList.add(book);
    }

    private static void retrieveBook() {
        //TODO:Cover logic when Booklist is empty
        Scanner scanner = new Scanner(System.in);
        for (Book book : bookList) {
            System.out.println(book);
        }

    }

}
