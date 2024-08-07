
import java.util.Scanner;

class powerfind {
    public static void main(String[] args) {
        int base, power, a = 1, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        base = sc.nextInt();
        System.out.println("Enter power");
        power = sc.nextInt();
        for (i = 1; i <= power; i++)
            a = a * base;
        System.out.println(a);
    }
}
