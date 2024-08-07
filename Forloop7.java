import java.util.Scanner;

public class Forloop7 {
    public static void main(String[] args) {
        int i, j, n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        n = s.nextInt(); // to input at runtime

        for (i = 1, j = 10; i <= 10 && j >= 1; i++, j--)
            System.out.println((n * i) + "  " + (n * j));
    }

}
