import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n, a, s = 0, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
        b = n;
        while (n > 0) {
            a = n % 10;
            s = s * 10 + a;
            n = n / 10;
        }
        if (s == b)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
