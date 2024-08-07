import java.util.Scanner;

public class Whileloop2 {
    public static void main(String[] args) {
        int i, n;
        double sum = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        i = 1;
        while (i <= n) {
            sum = sum + Math.pow(-1, (i + 1)) * (i * (i + 1)) / Math.pow((i + 1), 2);

            i++;
        }

        System.out.println(sum);

    }
}
