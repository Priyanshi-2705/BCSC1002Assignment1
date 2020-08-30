/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;
    private long uniRollNumber;
    private int bookIssued;
    private Book[] issuedBookName;

    public Student(String firstName, String middleName, String lastName, String fullName, long uniRollNumber, int bookIssued) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fullName = firstName + middleName + lastName;
        this.uniRollNumber = uniRollNumber;
        this.bookIssued = bookIssued;
        this.issuedBookName = new Book[bookIssued];
        for (int i = 0; i < issuedBookName.length; i++) {
            issuedBookName[i] = new Book("Book" + (i + 1));
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getUniRollNumber() {
        return uniRollNumber;
    }

    public void setUniRollNumber(long uniRollNumber) {
        this.uniRollNumber = uniRollNumber;
    }

    public int getBookIssued() {
        return bookIssued;
    }

    public void setBookIssued(int bookIssued) {
        this.bookIssued = bookIssued;
    }

    public Book[] getIssuedBookName() {
        return issuedBookName.clone();
    }

    public void setIssuedBookName(Book[] issued) {
        this.issuedBookName = issued;
    }

    @Override
    public String toString() {
        return String.format(
                "firstName: %s, middleName: %s, lastName: %s, fullName: %s, uniRollNumber: %l, bookIssued: %i",
                getFirstName(), getMiddleName(), getLastName(), getFullName(), getUniRollNumber(), getBookIssued(),
                Arrays.toString(issuedBookName)
        );
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return getUniRollNumber() == student.getUniRollNumber() &&
                getBookIssued() == student.getBookIssued() &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getMiddleName(), student.getMiddleName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Objects.equals(getFullName(), student.getFullName()) &&
                Arrays.equals(getIssuedBookName(), student.getIssuedBookName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getMiddleName(), getLastName(), getFullName(), getUniRollNumber(), getBookIssued(),
                Arrays.hashCode(getIssuedBookName()));
    }

}
