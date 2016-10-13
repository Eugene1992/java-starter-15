package hw05;

/**
 * 3. Не счастливые номера. Есть 999999 номерных знаков, подсчитать количество знаков
 * содержащих число 13 и вывести их все в консоль.
 */
public class UnhappyNumbers {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i < 999999; i++) {
            int number1 = i / 100000;
            int number2 = (i / 10000) % 10;
            int number3 = (i / 1000) % 10;
            int number4 = (i / 100) % 10;
            int number5 = (i / 10) % 10;
            int number6 = i % 10;
            if (number1 == 1 & number1 + number2 == 4) {
                result++;
            }
            if (number2 == 1 & number2 + number3 == 4) {
                result++;
            }
            if (number3 == 1 & number3 + number4 == 4) {
                result++;
            }
            if (number4 == 1 & number4 + number5 == 4) {
                result++;
            }
            if (number5 == 1 & number5 + number6 == 4) {
                result++;
            }
        }
        System.out.println("количество знаков: " + result);
    }
}
