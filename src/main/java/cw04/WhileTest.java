package cw04;

/**
 * Created by evgeniy on 10/10/16.
 */
public class WhileTest {
    public static void main(String[] args) {
        int counter = 5;
        int counter2 = 0;
        boolean b = false;

        while (counter2 < 3 && counter > 0) { // > < >= <= != ==
            System.out.println("hello");
            counter--;
            counter2++;
        }
    }
}
