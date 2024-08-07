import java.util.Scanner;

public class Forloop17 {
    public static void main(String[] args) {
        int i, x;
        double sum = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        x = sc.nextInt();
        for (i = 1; i <= x; i++)
            sum = sum + Math.pow(-1, i) * (double) (i * (i + 1)) / (i + 2);

        System.out.println(sum);

    }

}
