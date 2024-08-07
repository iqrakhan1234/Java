public class StringPattern4 {
    public static void main(String[] args) {
        String a = "JAVA";
        int i, j, b = 0;
        for (i = a.length() - 1; i >= 0; i--) {
            for (j = 0; j <= i; j++)
                System.out.print(a.charAt(b));
            System.out.println();
            b++;
        }
    }
}
// o/p=JJJJ
// ****AAA
// ****VV
// ****A