package cw03;

/**
 * Created by evgeniy on 07/10/16.
 */
public class SwitchExample {
    public static void main(String[] args) {
        int a = 13;

        if (a == 10) {
            System.out.println("A");
        } else if (a == 11) {
            System.out.println("B");
        } else if (a == 12) {
            System.out.println("C");
        } else {
            System.out.println("No matches!");
        }

        switch (a) {
            case 10:
                System.out.println("A");
                break;

            case 11:
                System.out.println("B");
                break;

            case 12:
                System.out.println("C");
                break;

            default:
                System.out.println("No matches!");
        }
    }
}
