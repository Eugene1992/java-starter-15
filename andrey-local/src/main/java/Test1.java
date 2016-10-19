public class Test1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 150;
        int d = 6000;

        if (a > b && a > c && a > d) {
            if (b > c && b > d) {
                System.out.println("b");
            } else if (c > d && c > b) {
                System.out.println("c");
            } else {
                System.out.println("d");
            }
        } else if (b > d && b > c && b > a) {
            if (d > c && d > a) {
                System.out.println("d");
            } else if (a > d && a > c) {
                System.out.println("a");
            } else {
                System.out.println("c");
            }
        } else if (c > d && c > b && c > a) {
            if (b > d && b > a) {
                System.out.println("b");
            } else if (d > c && d > a) {
                System.out.println("d");
            } else {
                System.out.println("a");
            }
        } else {
            if (a > c && a > b) {
                System.out.println("a");
            } else if (b > c && b > a) {
                System.out.println("b");
            } else {
                System.out.println("c");
            }
        }
    }
}
