package cw08;

import java.util.Arrays;

public class StringMethodsTest {
    public static void main(String[] args) {
        String s1 = "Hello world!";
        String s2 = "Hello world!";
        String s3 = "Hello world!!!";
        String s4 = "London is a capital of Great Britain!";

        System.out.println("Length of a string: " + s1.length());
        System.out.println("Get substring from 6 to end: " + s1.substring(6));
        System.out.println("Get substring from 6 to length() - 1: " + s1.substring(6, s1.length() - 1));
        System.out.println("Check strings for equal(s1, s2): " + s1.equals(s2));
        System.out.println("Check strings for equal(s1, s3): " + s1.equals(s3));

        String[] strings = s4.split(" ");
        System.out.println(Arrays.toString(strings));

        String email = "deyneko55@gmail.com";
        System.out.println(email.matches("^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@\"\n\t\t+ \"[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$"));
        String someString = "qwerty";
        System.out.println(someString.matches("^[a-z]$"));
        System.out.println("Char at 4 index: " + s1.charAt(4));

        System.out.println(s1.replace('H', 'h'));
        System.out.println(s1.replace("world", "Earth"));

        String apple = "Apple";
        String pen = "pen";
        System.out.println(apple.compareTo(pen));
        System.out.println(pen.compareTo(apple));
        System.out.println(apple.compareTo(apple));

        System.out.println(s1.concat("!!!"));

        System.out.println(s1.contains("world"));
        System.out.println(s1.contains("worlddddd"));

        String lowCase = "hello";
        String upperCase = "HELLO";
        System.out.println(lowCase.equals(upperCase));
        System.out.println(lowCase.equalsIgnoreCase(upperCase));

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        System.out.println(s1.endsWith("!"));
        System.out.println(s1.endsWith("!!!!!"));

        System.out.println(s1.startsWith("Hel"));
        System.out.println(s1.startsWith("Hel", 6));

        String stringWithSpace = "    Spaces    here     ";
        System.out.println(stringWithSpace.trim());

        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
        byte[] bytes = s1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
    }
}
