package hw07;

/**
 * 7. Найти минимальное и максимальное число в массиве.
 */
public class HW07_6 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
            minmax(arr);

    }
    static void minmax(int[] arr) {
            if (arr[0] > arr[1] && arr[0] > arr[2]) {
                System.out.println("max arr[0]");
            } else if (arr[1] > arr[2]) {
                System.out.println("max arr[1]");
            } else {
                System.out.println("max arr[2]");
            }
            if (arr[0] < arr[1] && arr[0] < arr[2]){
                System.out.println("min arr[0]");
            } else if (arr[1] < arr[2]){
                System.out.println("min arr[1]");
        }else{
                System.out.println("min arr[2]");
            }
    }
}