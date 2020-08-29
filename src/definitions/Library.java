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
}
