import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class String2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scan.nextLine();

        Matcher matcher = Pattern.compile("^[A-Za-z0-9+_.-]+.com$").matcher(str);
        System.out.println(matcher.matches());



    }
}
