package org.learn.functionalinterface;

import java.util.function.BiConsumer;

public class BiComparatorLambda {
    public static void main(String[] args) {
        BiConsumer<String, Integer> isCountMatching = (name, len) -> {
            if(name.length() == len) {
                System.out.println("Name's Length is matching");
                return;
            }
            System.out.println("Name's Length is not matching");

        };

        BiConsumer<String, Integer> doesStringContainChar = (name, ch) -> {
            if(name.indexOf(ch) > -1) {
                System.out.printf("%s contains %c", name, ch);
                System.out.println(ch);
                return;
            }
            System.out.printf("%s does not contain %c", name, ch.toString().charAt(0));

        };

        isCountMatching.andThen(doesStringContainChar).accept("Sinni", 83);
    }
}
