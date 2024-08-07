
import java.util.Scanner;

public class Forloop14 {
    public static void main(String[] args) {
        int i, sum = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
            sum = sum + (int) Math.pow(-1, (i + 1)) * i;
        System.out.println(sum);

    }

}