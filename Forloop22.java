import java.util.Scanner;

public class Forloop22 {
    public static void main(String[] args) {
        int i, n, x, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        System.out.println("Enter the value of x:");
        n = sc.nextInt();
        x = sc.nextInt();
        for (i = 1; i <= n; i++)
            sum = sum + (int) Math.pow(x, i);

        System.out.println(sum);
    }
}
