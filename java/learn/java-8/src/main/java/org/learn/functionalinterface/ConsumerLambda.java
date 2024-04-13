package org.learn.functionalinterface;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class ConsumerLambda {
    public static void main(String[] args) {
        Comparator<String> comp  = Comparator.naturalOrder();
        List<String> list = new ArrayList<>(List.of("Two", "One", "Zero"));
        list.sort(comp);
        list.forEach(System.out::println);
        System.out.println(list);
    }
}
