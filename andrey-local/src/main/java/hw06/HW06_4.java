package hw06;

/**
 * 3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
 */
public class HW06_4 {
    public static void main(String[] args) {
        rev(0);
    }
    static void rev (int numOne){
        for(int i = 90; i >= 0 ; i -= 5){
            System.out.println(i + "");
        }
    }
}
