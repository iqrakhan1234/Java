import java.util.Scanner;

public class Forloop9 {
    public static void main(String[] args) {
        int i, n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        n = s.nextInt(); // to input at runtime

        for (i = 1; i <= 10; i++) {
            System.out.println(n * i);
            System.out.println((n + 1) * i);
        }

    }

}
