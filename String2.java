import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        int i, c = 0;
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        a = sc.nextLine().toLowerCase();
        // .toLowerCase() is used to convert al the character
        // in string to lower case
        for (i = 0; i <= a.length() - 1; i++) {
            char b;
            b = a.charAt(i);
            if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u')
                c++;
        }
        System.out.println(c);
    }
}

// n=iqra Khan
// o/p=3
