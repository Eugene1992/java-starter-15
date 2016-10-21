package cw08;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Hello world!";              // literal style
        String s2 = new String("Hello world!");  // constructor style
        String s3 = "Hello" + " world" + '!';    // concatenation style
        String s4 = "Hello world!".substring(5); // method style
        String s5 = "Hello " + s1.substring(6);  // combo style

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
