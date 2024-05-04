package org.learn.concepts.streams;
import java.util.stream.IntStream;

public class ParallelStreams {
    public static void main(String[] args) {
        var list = IntStream.rangeClosed(1, 10);
        System.out.println(list);
    }
}
