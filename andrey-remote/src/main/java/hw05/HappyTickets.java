package hw05;

/**
 * 1. Счастливые билетики. Есть билеты с номерами от 000001 до 999999. «Счастливым» считается билетик у которого сумма первых
 * трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576. С помощью программы,
 * подсчитайте сколько счастливых билетов.
 */
public class HappyTickets {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 999999; i++) {
            int number1 = i / 100000;
            int number2 = (i / 10000) % 10;
            int number3 = (i / 1000) % 10 % 10;
            int number4 = (i / 100) % 10 % 10 % 10;
            int number5 = (i / 10) % 10 % 10 % 10 % 10;
            int number6 = i % 10 % 10 % 10 % 10;
            if (number1 + number2 + number3 == number4 + number5 + number6) {
                sum++;
            }
        }
        System.out.println(sum + " счастливых билетов.");
    }
}

