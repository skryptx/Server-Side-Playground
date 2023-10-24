package PrincetonUniversity.Algorithm1.week1;

import java.text.MessageFormat;

public class HelloGoodbye {
    public static void main(String[] args) {
        System.out.println(MessageFormat.format("Hello {0} and {1}", args[0], args[1]));
        System.out.println(MessageFormat.format("Goodbye {0} and {1}", args[1], args[0]));
    }
}
