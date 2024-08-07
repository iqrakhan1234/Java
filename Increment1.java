public class Increment1 {
    public static void main(String[] x) {
        int a = 2, b;

        b = ++a * a++ % ++a + a++;
        System.out.println(a + "  " + b);
    }

}
