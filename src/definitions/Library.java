/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] store;

    public Library() {
        this.store = new Book[10];
        for (int i = 0; i < store.length; i++) {
            store[i] = new Book("Book " + (i + 1));
        }
    }

    public Book[] getStore() {
        return store.clone();
    }

    public void setStore(Book[] store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return Arrays.toString(store);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass())
            return false;
        Library library = (Library) object;
        return Arrays.equals(getStore(), library.getStore());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getStore());
    }

    public void addBook(String bookName) {
        System.out.println(bookName + " is added to the Library");
    }

    public void doHireBook(String bookName) {
        System.out.println("Thank you for hiring \"" + bookName + "\"");
    }

    public void doReturnBook(String bookName) {
        System.out.println("Thank you for returning \"" + bookName + "\"");
    }

    public void bookAvailable() {
        for (Book book : this.store) {
            System.out.println(book);
        }
    }
}
