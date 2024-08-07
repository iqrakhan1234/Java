import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        int i, x;
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        a = sc.nextLine();
        System.out.print(a.charAt(0));
        for (i = 1; i <= a.length() - 1; i++) {
            if (a.charAt(i) == ' ')
                System.out.print(a.charAt(i + 1));
        }
        x = a.lastIndexOf(' ');
        for (i = x + 2; i <= a.length() - 1; i++) {
            System.out.print(a.charAt(i));
        }
    }
}
