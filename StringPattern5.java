public class StringPattern5 {
    public static void main(String[] args) {
        String a = "JAVA";
        int i, j;
        for (i = 0; i <= a.length() - 1; i++) {
            for (j = i; j <= a.length() - 1; j++)
                System.out.print(a.charAt(j));
            System.out.println();
        }
    }
}
// o/p=JAVA
// ****AVA
// ****VA
// ****A