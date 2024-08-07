import java.util.Scanner;

public class Forloopusingfunc {
    int i, n, sum = 0;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
    }

    void logic() {
        for (i = 1; i <= n; i++)
            sum = sum + (int) Math.pow(-1, i) * i * (int) Math.pow((i + 1), 2) * (int) Math.pow((i + 2), 2);
    }

    void output() {
        System.out.println(sum);
    }

    public static void main(String[] ar) {
        Forloopusingfunc x = new Forloopusingfunc();
        x.input();
        x.logic();
        x.output();

    }
}
