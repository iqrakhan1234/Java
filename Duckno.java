import java.util.Scanner;

public class Duckno {
    public static void main(String[] args) {
        int n, a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
        b = 0;
        while (n > 0) {
            a = n % 10;
            if (a == 0) {
                b = 1;
                break;
            }
            n = n / 10;
        }
        if (b == 1)
            System.out.println("is a duck no.");
        else
            System.out.println("is not a duck no.");
    }
}
