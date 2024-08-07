import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // if (button == 1) {
        // System.out.println("hello");
        // } else if (button == 2) {
        // System.out.println("namaste");
        // } else if (button == 3) {
        // System.out.println("bonjour");
        // } else {
        // System.out.println("invalid button");
        // }
        // (same ques using if else if and switch case.Switch case one looks more clean)
        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            default:
                System.out.println("invalid button");
        }
        sc.close();
    }
}
