public class Continue5 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 3; j++) {
                if (i >= 2 && j <= 2)
                    continue;
                else
                    System.out.println(i + " " + j);
            }
        }
    }
}
// o/p=1 1
// 1 2
// 1 3
// 2 3
// 3 3
// 4 3
// 5 3