public class StringPattern2 {
    public static void main(String[] args) {
        String a = "JAVA";
        int i, j;
        for (i = a.length() - 1; i >= 0; i--) {
            for (j = 0; j <= i; j++)
                System.out.print(a.charAt(j));
            System.out.println();

        }
    }
}
// o/p=JAVA
// ****JAV
// ****JA
// ****J
