public class Continue4 {
    public static void main(String[] args) {
        int i, j;
        for (i = 5; i >= 1; i = i - 2) {
            for (j = 1; j <= 5; j = j + 2) {
                if (i >= 3 && j <= 3)
                    continue;
                else
                    System.out.println(i + " " + j);
            }
        }
    }
}
// o/p=5 5
// 3 5
// 1 1
// 1 3
// 1 5
