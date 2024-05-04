package org.learn.concepts.streams;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreams {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList()));
    }
}
