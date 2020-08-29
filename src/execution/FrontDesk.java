/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import java.util.Scanner;

public class FrontDesk {
    public static final int ISSUE_A_NEW_BOOK_FOR_ME = 1;
    public static final int RETURN_A_PREVIOUSLY_ISSUES_BOOK_FOR_ME = 2;
    public static final int SHOW_ME_ALL_MY_ISSUES_BOOK = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
        System.out.println("How may I help you today?");
        System.out.println("1. Issue a new book for me.");
        System.out.println("2. Return a previously issues book for me.");
        System.out.println("3. Show me all my issues books.");
        System.out.println("4. Exit.");
        Scanner scanner = new Scanner(System.in);
        int studentInput = scanner.nextInt();
        scanner.close();
    }
}
