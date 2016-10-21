package cw08;

public class DoubleArrays {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = {
            //    0  1  2  3  4
            /*0*/{0, 1, 1, 1, 1},
            /*1*/{1, 0, 1, 1, 1},
            /*2*/{1, 1, 0, 1, 1},
            /*3*/{1, 1, 1, 0, 1},
            /*4*/{1, 1, 1, 1, 0}
        };

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
