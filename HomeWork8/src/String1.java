public class String1 {

    public static void main(String[] args) {

        int a = 11;
        int b = 75;

        StringBuilder a1 = new StringBuilder().append(a).append(" + ").append(b).append(" = ").append(a + b);
        StringBuilder a2 = new StringBuilder().append(a).append(" - ").append(b).append(" = ").append(a - b);
        StringBuilder a3 = new StringBuilder().append(a).append(" * ").append(b).append(" = ").append(a * b);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        a1.replace(8, 9, "равно");
        a2.replace(8, 9, "равно");
        a3.replace(8, 9, "равно");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}