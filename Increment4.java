public class Increment4 {

    public static void main(String[] args) {
        int a = 4, b;
        b = ++a % 3 + a++ * ++a % 3 + a++;

        System.out.println(a + " " + b);

    }
}
