import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        int i, c = 0;
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        a = sc.nextLine().toLowerCase();
        for (i = 0; i <= a.length() - 1; i++) {
            char b;
            b = a.charAt(i);
            if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u')
                c++;
            if (b == ' ') {
                System.out.println(c);
                c = 0;
            }
        }
        System.out.println(c);
    }
}
// n=iqra Khan
// o/p= 2
// 1