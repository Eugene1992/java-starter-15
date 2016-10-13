public class Test2 {
    public static void main(String[] args) {
        int x = 0;
        for (int i  = 100; i > 0; i--){
            x =  i + x;
            System.out.println(i);
        }
        System.out.println(x);
    }
}
