import java.util.Scanner;

public class Whileloop1 {
    public static void main(String[] args) {
        int i, n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        i = 1;
        while (i <= n) {
            sum = sum + (int) Math.pow(-1, i) * i * (int) Math.pow((i + 1), 2) * (int) Math.pow((i + 2), 2);

            i++;
        }

        System.out.println(sum);

    }
}