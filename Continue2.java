public class Continue2 {
    public static void main(String[] args) {
        int i, j;
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= 4; j++) {
                if (i <= 2 && j >= 2)
                    continue;
                else
                    System.out.println(i + " " + j);
            }
        }
    }
}
// o/p=5 1
// 5 2
// 5 3
// 5 4
// 4 1
// 4 2
// 4 3
// 4 4
// 3 1
// 3 2
// 3 3
// 3 4
// 2 1
// 1 1