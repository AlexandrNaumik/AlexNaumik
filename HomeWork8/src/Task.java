import java.util.Scanner;
import java.util.regex.Pattern;
public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String name = scan.nextLine();

        System.out.println("Введите возраст: ");
        int age = scan.nextInt();

        String regEx = "[A-Za-zа-яА-я ]+";
        try {
            if (age > 100 || age < 0) {
                throw new IncorrectInfoException("Incorrect age", name, age);
            }

            if (name.length() > 200 || !Pattern.matches(regEx, name)) {
                throw new IncorrectInfoException("Incorrect name", name, age);
            }
        } catch (IncorrectInfoException exception) {
            exception.printStackTrace();
        }
    }
}