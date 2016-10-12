package cw05;

public class NestedLoopsExample {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 10; i++) {
            inner:
            for (int j = 0; j < 10; j++) {
                if (j == 5) break;
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
        *
        **
        ***
        ****
        *****
        ******
        *******
        ********
        *********
        **********
        */
    }
}
