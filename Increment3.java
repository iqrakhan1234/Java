public class Increment3 {
    public static void main(String[] args) {
        int a = 2, b;
        b = ++a % 2 + a++ % 4 + ++a + a++;
        System.out.println(a + " " + b);

    }

}
