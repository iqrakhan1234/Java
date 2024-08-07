public class Continue1 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 4; j++) {
                if (i >= 2 && j >= 2)
                    continue;
                else
                    System.out.println(i + " " + j);
            }
        }
    }
}
// op=1 1
// 1 2
// 1 3
// 1 4
// 2 1
// 3 1
