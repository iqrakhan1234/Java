public class Twoconditionsusingfunc {
    int i, j;

    void logic() {

        for (i = 0, j = 10; i <= 4 && j >= 6; i++, j--) {

        }

    }

    void output() {
        System.out.println(i + " " + j);

    }

    public static void main(String[] ar) {
        Twoconditionsusingfunc x = new Twoconditionsusingfunc();
        x.logic();
        x.output();
    }

}
