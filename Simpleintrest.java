import java.util.Scanner;

public class Simpleintrest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter p");
        int p = scan.nextInt();
        System.out.println("enter r");
        int r = scan.nextInt();
        System.out.println("enter t");
        int t = scan.nextInt();
        int SI = (p * r * t / 100);
        System.out.println("SI is :" + SI);
        scan.close();

    }
}
