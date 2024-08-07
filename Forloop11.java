import java.util.Scanner;

public class Forloop11 {
    public static void main(String[] args) {
        int n, s = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
            s = s + n * (n + 1) * (n + 2);
        System.out.println(s);

    }

}