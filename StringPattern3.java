public class StringPattern3 {
    public static void main(String[] args) {
        String a = "JAVA";
        int i, j;
        for (i = 0; i <= a.length() - 1; i++) {
            for (j = 0; j <= i; j++)
                System.out.print(a.charAt(i));
            System.out.println();
        }
    }
}
// o/p=J
// ****AA
// ****VVV
// ****AAAA
