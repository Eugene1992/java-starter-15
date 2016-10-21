package cw08;

public class DoubleArrays {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        arr1[0][0] = 0;
        arr1[0][1] = 0;
        arr1[0][2] = 0;
        arr1[1][0] = 0;
        arr1[1][1] = 0;
        arr1[1][2] = 0;
        arr1[2][0] = 0;
        arr1[2][1] = 0;
        arr1[2][2] = 0;

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
                System.out.print(i == j ? arr2[i][j] : " ");
            }
            System.out.println();
        }

        int[][][][][][][][][][] arr3 = new int[3][3][3][3][3][3][3][3][3][3];

        int[][] arr4 = {
            {0, 1, 2},
            {0, 1, 2, 3, 4},
            {0, 1, 2, 3},
            {0, 1, 2, 3, 4, 5, 6}
        };
    }
}
