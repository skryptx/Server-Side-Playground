package org.learn.functionalinterface;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
    public static void main(String[] args) {
        Comparator<String> comp  = Comparator.naturalOrder();
        List<String> list = new java.util.ArrayList<>(List.of("Two", "One"));
        list.sort(comp);
        list.forEach(System.out::println);
        System.out.println(list);
    }
}
