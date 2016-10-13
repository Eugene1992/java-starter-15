import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int i  = scan.nextInt();
        if (  i % 2 == 0){
            System.out.println("Число парное");
        }else{
            System.out.println("Число не парное");
        }
    }
}
