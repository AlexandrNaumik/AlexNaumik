import java.io.Serializable;
import java.util.Arrays;

public class Reader implements Serializable {
    private String surnameName;
    private int librarycard;
    private String faculty;
    private int dataBirth;
    private int number;
    private Book[] books = new Book[5];

    public Reader() {
    }

    public String getSurnameName() {
        return this.surnameName;
    }

    public void setSurnameName(String surnameName) {
        this.surnameName = surnameName;
    }

    public int getLibrarycard() {
        return this.librarycard;
    }

    public void setLibrarycard(int librarycard) {
        this.librarycard = librarycard;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getDataBirth() {
        return this.dataBirth;
    }

    public void setDataBirth(int dataBirth) {
        this.dataBirth = dataBirth;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Book[] getBooks() {
        return this.books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void printStatus() {
        System.out.print(this.surnameName);
        int count = 0;
        String bookName = "";
        if (this.books != null) {
            for(int i = 0; i < this.books.length; ++i) {
                Book book = this.books[i];
                if (book != null) {
                    String value = book.getName();
                    bookName = bookName + value + ", ";
                    ++count;
                }
            }

            System.out.println(" взял " + count + " книг:" + bookName);
        }

    }

    public void takeBook(Book book) {
        int count = 0;

        for(int i = 0; i < this.books.length; ++i) {
            Book book1 = this.books[i];
            if (book1 != null) {
                ++count;
            }
        }

        this.books[count] = book;
        String var10001 = this.surnameName;
        System.out.println(var10001 + " взял книгу:" + book.getName());
    }

    public void returnBook(String bookName) {
        boolean isFound = false;

        for(int i = 0; i < this.books.length; ++i) {
            Book book = this.books[i];
            if (book != null && book.getName().equals(bookName)) {
                this.deleteItemFromArray(i);
                isFound = true;
                System.out.println(this.surnameName + " вернул книгу:" + bookName);
                break;
            }
        }

        if (!isFound) {
            System.out.println(this.surnameName + " не хранит книгу:" + bookName);
        }

    }

    private void deleteItemFromArray(int index) {
        for(int i = index; i < this.books.length - 1; ++i) {
            if (i > 0) {
                this.books[i - 1] = this.books[i];
            }

            this.books[i] = null;
        }

    }

    public String toString() {
        String var10000 = this.surnameName;
        return "Reader{surnameName='" + var10000 + "', librarycard=" + this.librarycard + ", faculty='" + this.faculty + "', dataBirth=" + this.dataBirth + ", number=" + this.number + ", books=" + Arrays.toString(this.books) + "}";
    }
}
