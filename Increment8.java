
public class Increment8 {

    public static void main(String[] args) {
        int a = 4;
        a += ++a * a++ % 4 + ++a % 10 + a++;
        System.out.println(a);
    }

}
