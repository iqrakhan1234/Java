public class Increment7 {

    public static void main(String[] args) {
        int a = 2, b;
        b = --a * a++ % 2 + ++a * --a;
        System.out.println(a + " " + b);
    }

}
