package cw07;

public class ArrayInit {
    public static void main(String args[]) {
        int[] arr1 = new int[3]; // Java style
        int arr2[] = new int[3]; // C style
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 31;

        int arr3[] = new int[]{1, 2, 3};
        int[] arr4 = {1, 2, 3, -12, 100, 200, -120};

        printArray(arr4);
        printArrayByForEach(arr3);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void printArrayByForEach(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
