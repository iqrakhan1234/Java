import java.util.Scanner;

public class Armstrongusingfunc {
    int n, a, s, b;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        n = sc.nextInt();
        b = n;
    }

    void logic() {
        while (n > 0) {
            a = n % 10;
            s = s + (int) Math.pow(a, 3);
            n = n / 10;
        }
    }

    void output() {
        if (s == b)
            System.out.println("it is a armstrong no.");
        else
            System.out.println("it is not a armstrong no.");
    }

    public static void main(String[] ar) {
        Armstrongusingfunc x = new Armstrongusingfunc();
        x.input();
        x.logic();
        x.output();

    }
}
