public class Increment9 {
    public static void main(String[] args) {
        int a = 4;
        a += ++a * a++ / 4 + a++ * ++a % 3;
        System.out.println(a);
    }

}
