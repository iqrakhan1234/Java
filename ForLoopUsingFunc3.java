public class ForLoopUsingFunc3 {
    int i, s = 0;

    void logic() {
        for (i = 1; i <= 10; i++)
            s = s + i;
    }

    void output() {
        System.err.println(s);
    }

    public static void main(String[] ar) {
        ForLoopUsingFunc3 x = new ForLoopUsingFunc3();
        x.logic();
        x.output();
    }
}
