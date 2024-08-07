public class Increment11 {
    public static void main(String[] args) {
        int a = 4, b = 6;
        b += ++a * ++b * b++ % ++a * ++b;
        System.out.println(a + " " + b);

    }
}
