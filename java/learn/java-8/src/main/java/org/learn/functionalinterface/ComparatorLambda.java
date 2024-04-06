package org.learn.functionalinterface;
import java.util.Comparator;

public class ComparatorLambda {
    public static void main(String[] args) {
        Comparator<Integer> comp  = (a,b) -> a-b;
        System.out.println(comp.compare(4,1));
    }
}
