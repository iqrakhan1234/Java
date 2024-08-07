import java.util.Scanner;

public class ReeverseString {
    public static void main(String[] args) {
        String a;
        String b = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        a = sc.nextLine();

        for (int i = 0; i <= a.length() - 1; i++)
            b = a.charAt(i) + b;

        // by using backward loop
        // for (int i = a.length() - 1; i >= 0; i--)
        // b = b + a.charAt(i);

        System.out.println(b);

    }
}
