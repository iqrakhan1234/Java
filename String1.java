import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        int i;
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        a = sc.nextLine();
        System.out.print(a.charAt(0) + " ");
        for (i = 1; i <= a.length() - 1; i++) {
            if (a.charAt(i) == ' ')
                System.out.print(a.charAt(i + 1));
        }
    }
}
// n=Iqra Khan
// o/p=I
// K