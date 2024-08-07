import java.util.Scanner;

public class Forloop26 {
    public static void main(String[] args) {
        int i, n, x, a, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        System.out.println("Enter the value of x:");
        n = sc.nextInt();
        x = sc.nextInt();
        a = 2;
        for (i = 1; i <= n; i = i + 2) {
            sum = sum + (int) Math.pow(-1, a) * (int) Math.pow(x, i);
            a++;
        }

        System.out.println(sum);
    }
}
