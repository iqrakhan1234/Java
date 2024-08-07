import java.util.Scanner;

public class BasePowerUsingfunc {
    int base, power, a = 1, i;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base");
        base = sc.nextInt();
        System.out.println("enter power");
        power = sc.nextInt();
    }

    void logic() {
        for (i = 1; i <= power; i++)
            a = a * base;
    }

    void output() {
        System.out.println(a);
    }

    public static void main(String[] ar) {
        BasePowerUsingfunc x = new BasePowerUsingfunc();
        x.input();
        x.logic();
        x.output();

    }
}
