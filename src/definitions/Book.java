/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAuthorName;
    private String isbnNumberOfBook;

    public Book() {
        this.bookName = "Java A Beginner's Guide";
        this.bookAuthorName = "Herbert Schildt";
        this.isbnNumberOfBook = "9781259589317";
    }

    public Book(String bookName, String bookAuthorName, String isbnNumberOfBook) {
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.isbnNumberOfBook = isbnNumberOfBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    public String getIsbnNumberOfBook() {
        return isbnNumberOfBook;
    }

    public void setIsbnNumberOfBook(String isbnNumberOfBook) {
        this.isbnNumberOfBook = isbnNumberOfBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthorName='" + bookAuthorName + '\'' +
                ", isbnNumberOfBook='" + isbnNumberOfBook + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getBookName().equals(book.getBookName()) &&
                getBookAuthorName().equals(book.getBookAuthorName()) &&
                getIsbnNumberOfBook().equals(book.getIsbnNumberOfBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getBookAuthorName(), getIsbnNumberOfBook());
    }
}
