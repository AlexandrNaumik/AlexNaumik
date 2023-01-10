import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class String3 {
    public static void main(String[] str) {
        String value = "ahb acb aeb aeeb adcb axeb";
        String[] array = value.split(" ");
        Pattern pattern = Pattern.compile("(^a.b$)");

        for (int i = 0; i < array.length; i++) {
            String n = array[i];
            Matcher matcher = pattern.matcher(n);
            if (matcher.matches()) {
                System.out.println(n);
            }

        }
    }
}
