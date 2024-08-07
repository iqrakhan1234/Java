import java.util.Scanner;

public class Forloop8 {
    public static void main(String[] args) {
        int n, m, a = 1, i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter base");
        n = s.nextInt();
        System.out.println("Enter power");
        m = s.nextInt();
        for (i = 1; i <= m; i++)
            a = a * i;
        System.out.println(a);

    }

}