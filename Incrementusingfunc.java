public class Incrementusingfunc {
    int a = 7, b = 4;

    void logic() {
        b += --a * a++ % ++b * b-- + --b * --a;
    }

    void output() {
        System.out.println(a + " " + b);
    }

    public static void main(String[] ar) {
        Incrementusingfunc x = new Incrementusingfunc();
        x.logic();
        x.output();

    }
}
