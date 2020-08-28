/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Book Name: ");
        String bookName = scanner.nextLine();
        book.setBookName(bookName);

        System.out.println("Enter the Author Name: ");
        String authorName = scanner.nextLine();
        book.setAuthorName(authorName);

        System.out.println("Enter the ISBN Number: ");
        String isbnNumber = scanner.nextLine();
        book.setIsbnNumber(isbnNumber);

        scanner.close();

        System.out.println(
                "Book Name: " + book.getBookName() + ", " +
                        "Author Name: " + book.getAuthorName() + ", " +
                        "ISBN Number: " + book.getIsbnNumber() + "."
        );
    }
}
