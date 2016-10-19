package hw06;

/**
 * 4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 …. //hw04
 */
public class HW06_5 {
    public static void main(String[] args) {
        man(0);
    }
    static void man(int ck){
        int res = 2;
        for(int i = 0; i < 20; i++){
            System.out.println(res);
            res *= 2;
        }
    }
}
