import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private String authorName;
    private String text;

    public Book() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return "Book{name='" + this.name + "', authorName='" + this.authorName + "', text='" + this.text + "'}";
    }
}
