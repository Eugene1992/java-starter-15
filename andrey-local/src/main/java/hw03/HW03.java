package hw03;

//Задание 2
import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = scan.nextInt();
        float secondNumber = scan.nextFloat();
        int n = 5;
        if (n % 2 == 0) {
            System.out.println("Число " + n + " - четное");
        } else {
            System.out.println("Число " + n + " - нечетное");
            System.out.println(firstNumber);
            System.out.println(secondNumber);
        }
    }
}



    //Задание 4

    /*public class HW03 {
        public static void main(String[] args) {
            int a = 56 , b = 23, c = 177;

            if ( a < b ) { a = b; }
            if ( a < c ) { a = c; }
            System.out.println(a);

        }
    }*/


/*
//Задание 5
public class HW03{
    public static void main(String[] args) {
        int x = 100, y=5, g = 200, z = 2000;
        if(x>y){

        }if(x>g){

        }if(x>z){
            System.out.println("Large is x");
        }if(z>y){
            System.out.println("Large is z");
        }else{
            System.out.println("Large is y");
        }if (g>z){
            System.out.println("Large is g");
        }else{
            System.out.println("Large is g");
        }
    }
}
*/

