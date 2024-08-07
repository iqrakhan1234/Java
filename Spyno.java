import java.util.Scanner;

public class Spyno {
    public static void main(String[] args) {
        int n, a, s = 0, s1 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
        while (n > 0) {
            a = n % 10;
            s = s + a;
            s1 = s1 * a;
            n = n / 10;
        }
        if (s == s1)
            System.out.println("it is a spy no.");
        else
            System.out.println("it is not a spy no.");
    }

}
