public class StringPattern8 {
    public static void main(String[] args) {
        String a = "JAVA";
        int i, j, k, b = 3;
        for (i = 0; i <= a.length() - 1; i++) {
            for (j = 1; j <= b; j++) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print(a.charAt(k) + " ");
            }
            b--;
            System.out.println();
        }
        b = 1;
        for (i = 2; i >= 0; i--) {
            for (j = 1; j <= b; j++) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print(a.charAt(k) + " ");
            }
            b++;
            System.out.println();
        }
    }
}
// o/p= **J
// ******J A
// *****J A V
// ****J A V A
// *****J A V
// ******J A
// *******J
