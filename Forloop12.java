import java.util.Scanner;

public class Forloop12 {
    public static void main(String[] args) {
        int n, i;
        double s = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
            s = s + (double) i * (i + 1) / (i + 1);
        System.out.println(s);

    }

}