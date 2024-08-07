
import java.util.Scanner;

public class Forloop13 {
    public static void main(String[] args) {
        int i, s = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
            s = s + i * ((i + 1) * (i + 1));
        System.out.println(s);

    }

}
