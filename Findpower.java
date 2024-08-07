import java.util.Scanner;

public class Findpower {
    public static void main(String[] iqra) {
        int b, p, a = 1, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and power");
        b = sc.nextInt();
        p = sc.nextInt();
        for (i = 1; i <= p; i++)
            a = a * b;

        System.out.println(a);
    }
}
