
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class String4 {
        public static void main(String[] str) {
            String value = "ab abab abab abababab abea";
            String[] array = value.split(" ");
            Pattern pattern = Pattern.compile("ab+|ab.+");

            for (int i = 0; i < array.length; i++) {
                String n = array[i];
                Matcher matcher = pattern.matcher(n);
                if (matcher.matches()) {
                    System.out.println(n);
                }

            }
        }
}
