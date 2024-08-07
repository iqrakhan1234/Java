import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter second number");
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        int diff = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;
        System.out.println("sum is : " + sum);
        System.out.println("diff is : " + diff);
        System.out.println("mul is : " + mul);
        System.out.println("div is : " + div);
        System.out.println("mod is : " + mod);
    }

}
