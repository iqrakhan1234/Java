import java.util.Scanner;

public class SumUsingFunc {
    int i, n;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();

    }

    void logic() {
        for (i = 1; i <= 10; i++) {

        }

    }

    void output() {
        System.out.println(n * i);

    }

    public static void main(String[] ar) {
        SumUsingFunc x = new SumUsingFunc();
        x.input();
        x.logic();
        x.output();
    }
}
