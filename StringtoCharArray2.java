public class StringtoCharArray2 {
    public static void main(String[] args) {
        String a = "java";
        char b[] = a.toCharArray();
        int c = 1, i, j;
        for (i = 0; i <= b.length - 1; i++) {
            if (b[i] != ' ') {
                for (j = i + 1; j <= b.length - 1; j++) {
                    if (b[i] == b[j]) {
                        c++;
                        b[j] = ' ';
                    }
                }
                System.out.println(b[i] + " " + c);
            }
            c = 1;
        }
    }
}
