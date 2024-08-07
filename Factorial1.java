import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        int i, n, f = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();

        // for(i=1;i<=n;i++)
        if (n < 0) {
            System.out.println("invalid no.");
        }
        for (i = n; i >= 1; i--) {
            f = f * i;
            System.out.println(f);
        }
    }
}
