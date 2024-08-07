import java.util.Scanner;

public class Palindromeusingfunc {
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
            s = s * 10 + a;
            n = n / 10;
        }
    }

    void output() {
        if (s == b)
            System.out.println("it is a palindrome no.");
        else
            System.out.println("it is not a palindrome no.");
    }

    public static void main(String[] ar) {
        Palindromeusingfunc x = new Palindromeusingfunc();
        x.input();
        x.logic();
        x.output();

    }
}
