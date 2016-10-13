import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        double d = scan.nextDouble();
        double d1 = scan.nextDouble();
        if (d < 0) {
            d = d * -1;
        }
        if (d1 < 0) {
            d1 = d1 * -1;
        }
        if (10 - d < 10 - d1){
            System.out.println("d");
        }else{
            System.out.println("d1");
        }
    }
}
