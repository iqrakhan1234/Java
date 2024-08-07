import java.util.Scanner;

public class Whileloop3 {
    public static void main(String[] args) {
        int n, i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        i = 1;
        while (i <= n) {

            sum = sum + (int) Math.pow(-1, i + 1) * (i * (i + 1) * (i + 2));

            i++;
        }
        System.out.println(sum);
    }

}
