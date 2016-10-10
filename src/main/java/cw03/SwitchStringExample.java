package cw03;

/**
 * Created by evgeniy on 07/10/16.
 */
public class SwitchStringExample {
    public static void main(String[] args) {
        String myStringVariable = "A";

        if (myStringVariable.equals("A")) {
            System.out.println(10);
        } else if (myStringVariable.equals("B")) {
            System.out.println(11);
        } else if (myStringVariable.equals("C")) {
            System.out.println(12);
        } else {
            System.out.println("No matches!");
        }

        /*  Into switch types
            - all primitives
            - all wrappers
            - String (since 1.7)
            - ENUM   (since 1.7)
        */
        switch (myStringVariable) {
            case "A":
                System.out.println(10);
                break;

            case "B":
                System.out.println(11);
                break;

            case "C":
                System.out.println(12);
                break;

            default:
                System.out.println("No matches!");
        }
    }
}
