public class Increment2 {
    public static void main(String[] x) {
        int a = 4, b;
        b = a++ * ++a / a++ * ++a;
        System.out.println(a + " " + b);

    }
}