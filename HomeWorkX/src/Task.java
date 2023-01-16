import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task {
    public Task() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reader[] readers = new Reader[10];

        int action;
        label98:
        do {
            System.out.println("1--добавить нового читателя");
            System.out.println("2--читатель хочет взять книгу");
            System.out.println("3--читатель хочет вернуть книгу");
            System.out.println("4--вывести статус читателя");
            System.out.println("5--вывести статус всех читателей");
            System.out.println("6--save reader");
            System.out.println("7--выйти из программы");
            System.out.println("Введите номер действия");
            action = scanner.nextInt();
            scanner.nextInt();
            Reader r;
            String bookName;
            int i;
            int i1;
            switch (action) {
                case 1:
                    boolean isFull = true;

                    for(i = 0; i < readers.length - 1; ++i) {
                        if (readers[i] == null) {
                            r = createReader();
                            readers[i] = r;
                            isFull = false;
                            break;
                        }
                    }

                    if (isFull) {
                        System.out.println("Количество читателей уже максимальное");
                    }
                    break;
                case 2:
                    System.out.println("Введите название книги ");
                    bookName = scanner.next();
                    System.out.println("Введите название автора ");
                    String authorName = scanner.next();
                    Book b1 = new Book();
                    b1.setName(bookName);
                    b1.setAuthorName(authorName);
                    System.out.println("введите номер читательского билета");
                    i = scanner.nextInt();
                    scanner.nextInt();
                    boolean found = false;

                    for(i = 0; i < readers.length - 1; ++i)
                        if (readers[i] != null && readers[i].getNumber() == i) {
                            Reader rr = readers[i];
                            rr.takeBook(b1);
                            found = true;
                            break;
                        }

                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                case 3:
                    System.out.println("Введите название книги ");
                    bookName = scanner.next();
                    System.out.println("Введите номер читательского билета ");
                    i = scanner.nextInt();
                    scanner.nextInt();
                    found = false;

                    for(i = 0; i < readers.length - 1; ++i) {
                        if (readers[i] != null && readers[i].getNumber() == i) {
                            Reader rr = readers[i];
                            rr.returnBook(bookName);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                case 4:
                    System.out.println("Введите номер читательского билета ");
                    int number = scanner.nextInt();
                    scanner.nextInt();
                    found = false;

                    for(i = 0; i < readers.length - 1; ++i) {
                        if (readers[i] != null && readers[i].getNumber() == number) {
                            Reader rr = readers[i];
                            rr.printStatus();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                case 5:
                    List<Reader> readersFromFile = FileUtil.restoreReadersList();
                    Iterator var5 = readersFromFile.iterator();

                    while(true) {
                        if (!var5.hasNext()) {
                            continue label98;
                        }

                        r = (Reader)var5.next();
                        if (r != null && r.getBooks() != null) {
                            r.printStatus();
                        }
                    }
                case 6:
                    FileUtil.saveReadersList(Arrays.asList(readers));
                    break;
                case 7:
                    System.out.println("Завершаем программу");
                    break;
                default:
                    System.out.println("Нет такой команды");
            }
        } while(action != 7);

    }

    private static Reader createReader() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите имя нового читателя");
        String readerName = scanner.next();
        System.out.println("введите номер читательского билета");
        int readerNumber = scanner.nextInt();
        Reader r = new Reader();
        r.setSurnameName(readerName);
        r.setNumber(readerNumber);
        return r;
    }
}