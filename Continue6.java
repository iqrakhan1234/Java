public class Continue6 {
    public static void main(String[] args) {
        int i, j;
        for (i = 5; i >= 1; i = i - 2) {
            for (j = 1; j <= 10; j = j + 4) {
                if (i >= 2 && j <= 4)
                    continue;
                else
                    System.out.println(i + " " + j);
            }
        }
    }
}
// o/p= 5 5
// 5 9
// 3 5
// 3 9
// 1 1
// 1 5
// 1 9
