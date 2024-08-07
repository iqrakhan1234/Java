public class StringPattern7 {
    public static void main(String[] args) {
        int i, j, k, b = 0;
        String a = "JAVA";
        for (i = a.length() - 1; i >= 0; i--) {
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
// o/p=J A V A
// *****J A V
// ******J A
// *******J
