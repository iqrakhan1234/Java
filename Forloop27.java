import java.util.Scanner;

public class Forloop27 {
    public static void main(String[] args) {
        int i, n;
        double sum = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
            sum = sum + Math.pow(-1, i) * (i) / Math.pow(i, 2);

        System.out.println(sum);

    }
}
