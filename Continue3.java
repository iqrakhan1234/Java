public class Continue3 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i = i + 2) {
            for (j = 1; j <= 5; j++) {
                if (i > 3 && j <= 3)
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
// 1 4
// 1 5
// 3 1
// 3 2
// 3 3
// 3 4
// 3 5
// 5 4
// 5 5
