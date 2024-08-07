import java.util.Scanner;

public class Neonno {
    public static void main(String[] args) {
        int n, a, s = 0, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
        b = n;
        while (n > 0) {
            a = n % 10;
            s = s + a;
            n = n / 10;
        }
        if (b == (int) Math.pow(s, 2))
            System.out.println("it is a neon no.");
        else
            System.out.println("it is not a neon no.");

    }
}
