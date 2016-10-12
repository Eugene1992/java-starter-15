package cw05;

/**
 * Created by Student on 10/12/2016.
 */
public class NestedLoopsTask {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
