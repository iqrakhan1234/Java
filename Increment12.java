public class Increment12 {
    public static void main(String[] args) {
        int a = 7, b = 4;
        b += --a * a++ % ++b * b-- + --b * --a;
        System.out.println(a + " " + b);

    }
}
