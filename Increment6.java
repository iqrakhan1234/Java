public class Increment6 {

    public static void main(String[] args) {
        int a = 4, b;
        b = ++a * --a + a++ * a++ % ++a - a--;
        System.out.println(a + " " + b);
    }

}
