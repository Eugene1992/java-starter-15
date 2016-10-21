package cw08;

public class Monet {
    public static void main(String[] args) {
        int rand;
        int orel = 0;
        int reshka = 0;
        int t = 0;
        for (int j = 0; j < 100; j++) {


            for (int i = 0; i < 100; i++) {
                rand = (int) (Math.random() * 10);
                if (rand % 2 == 0) {
                    orel++;
                } else {
                    reshka++;
                }

            }
            if (orel > reshka && orel - reshka > 10) {
                System.out.println("Орел выпал: " + orel);
                System.out.println("Решка выпал: " + reshka);
                t++;
            } else if (reshka - orel > 10) {
                System.out.println("Орел выпал: " + orel);
                System.out.println("Решка выпал: " + reshka);
                t++;
            }

            reshka = 0;
            orel = 0;

        }
        System.out.println(t);
    }

}
