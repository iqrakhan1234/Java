import java.util.Scanner;

public class Tableusingforloop {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        for (i = 1; i <= 10; i++) {
            System.out.println(n * i);

        }

    }

}