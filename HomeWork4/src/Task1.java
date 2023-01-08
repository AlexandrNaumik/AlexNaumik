public class Task1 {
    public Task1() {
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("name 1");
        book1.setAuthorName("Autor 1");
        book1.setText("Text 1");
        Book book2 = new Book();
        book2.setName("name 2");
        book2.setAuthorName("Autor 2");
        book2.setText("Text 2");
        Book book3 = new Book();
        book3.setName("name 3");
        book3.setAuthorName("Autor 3");
        book3.setText("Text 3");
        Book book4 = new Book();
        book4.setName("name 4");
        book4.setAuthorName("Autor 4");
        book4.setText("Text 4");
        Book book5 = new Book();
        book5.setName("name 5");
        book5.setAuthorName("Autor 5");
        book5.setText("Text 5");
        Book book6 = new Book();
        book6.setName("name 6");
        book6.setAuthorName("Autor 6");
        book6.setText("Text 6");
        Book book7 = new Book();
        book7.setName("name 7");
        book7.setAuthorName("Autor 7");
        book7.setText("Text 7");
        Book book8 = new Book();
        book8.setName("name 8");
        book8.setAuthorName("Autor 8");
        book8.setText("Text 8");
        Book book9 = new Book();
        book9.setName("name 9");
        book9.setAuthorName("Autor 9");
        book9.setText("Text 9");
        Book book10 = new Book();
        book10.setName("name 10");
        book10.setAuthorName("Autor 10");
        book10.setText("Text 10");
        Book[] books = new Book[10];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;
        books[5] = book6;
        books[6] = book7;
        books[7] = book8;
        books[8] = book9;
        books[9] = book10;
        Reader reader1 = new Reader();
        reader1.setSurnameName("setSurnameName4");
        reader1.setBooks(books);
        reader1.printStatus();
        reader1.takeBook(book5);
        reader1.returnBook("name 5");
    }
}
