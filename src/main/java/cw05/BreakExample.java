package cw05;

public class BreakExample {
    public static void main(String[] args) {
        for (int counter = 0; counter < 10; counter++) {
            if (counter == 5) break;
            System.out.println(counter);
        }
        System.out.println("End");
    }
}
