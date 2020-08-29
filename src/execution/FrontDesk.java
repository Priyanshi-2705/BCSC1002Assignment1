/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;

public class FrontDesk {
    public static void main(String[] args) {
        Book book = new Book("The Story of my Life", "Helen Keller");
        Book book1 = new Book("Cantervilla Ghost", "Oliver Twist");
        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
    }
}
