/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String bookAuthorName;
    private String isbnNumberOfBook;

    Book() {
        this.bookName = "Java A Beginner's Guide";
        this.bookAuthorName = "Herbert Schildt";
        this.isbnNumberOfBook = "9781259589317";
    }

    Book(String bookName, String bookAuthorName, String isbnNumberOfBook) {
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
}
