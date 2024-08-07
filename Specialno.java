import java.util.Scanner;

public class Specialno {
    public static void main(String[] args) {
        int n, a, s = 0, b, s1 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
        if (n > 9 && n < 100) {
            b = n;
            while (n > 0) {
                a = n % 10;
                s = s + a;
                s1 = s1 * a;
                n = n / 10;
            }
            if (b == s + s1)
                System.out.println("it is a special no.");
            else
                System.out.println("it is not a special no.");
        } else
            System.out.println("not a two digit number");

    }
}
