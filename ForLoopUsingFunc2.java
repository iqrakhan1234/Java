import java.util.Scanner;

public class ForLoopUsingFunc2 {
    int i, s = 0, n;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        n = sc.nextInt();
    }

    void logic() {
        for (i = 1; i <= n; i++)
            s = s + i * ((i + 1) * (i + 1));

    }

    void output() {
        System.out.println(s);
    }

    public static void main(String[] ar) {
        ForLoopUsingFunc2 x = new ForLoopUsingFunc2();
        x.input();
        x.logic();
        x.output();
    }
}
