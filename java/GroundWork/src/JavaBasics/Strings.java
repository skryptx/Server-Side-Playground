package JavaBasics;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String s = "This is big ass string.";
        /*
        Left to right computation
         */
        System.out.println(2 + 3 + "4"); // 54
        System.out.println("2" + 3 + 4); // 234

        System.out.println('2' + 3 + 4); // 57 ? => Ascii equivalent of '2' is 50

        System.out.println(s.charAt(8)); // b, s[8] is not allowed on string

        // Convert string to array
        char[] sArray = s.toCharArray(); // array basically

        System.out.println(s.contains("is"));
        System.out.println(s.indexOf("is"));

        String sinni = "sinni";
        String[] sinniArray = sinni.split("");
        for(String ele: sinniArray) {
            System.out.println(ele.toUpperCase());
        }
    }
}
