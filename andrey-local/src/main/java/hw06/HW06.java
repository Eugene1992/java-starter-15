package hw06;

/**  Задание 4
 * Найти максимальное значение 3х чисел.
 */
public class HW06 { //Задание 4 hw03
    public static void main(String[] args) {
        System.out.println(maxNumber(5, 500, 10));
    }

    static int maxNumber(int one, int two, int three){

        if (one > two && one > three){
            return one;
        }else if(two > three ){
            return two;
        }else{
            return three;
        }
    }
}
