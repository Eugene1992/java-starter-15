import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*interval(1, 8);
        interval(0, 100);
        System.out.println(sumOneTwo(0, 2, 50));
        System.out.println(ariphmetic(0, 2, 10));*/
//        System.out.println(ref(5));
        System.out.println(max(3));

    }

    static void interval(int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.println(i);
        }
    }

    static int sumOneTwo(int start, int interval, int end) {
        int sum = 0;
        for (int i = start; i < end; i += interval) {
            sum = sum + i;
        }
        return sum;
    }

    static double ariphmetic(int start, int interval, int end) {
        int s = 0;
        int d = 0;
        for (int i = start; i < end; i += interval, d++) {
            s = s + i;
        }
        return s / d;
    }
    static int ref(int st) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int s;
        while (st > 0) {
            s = sc.nextInt();
            sum = sum + s;
            st--;
        }
        return sum;
    }
    static int max(int num){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        num--;
        int cur;
        while (num > 0){
            cur = sc.nextInt();
            if (cur > max) max = cur;
            num--;
        }
        return max;
    }
}
