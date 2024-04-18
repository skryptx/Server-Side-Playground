package org.learn.concepts.streams;

import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4);
        var result = nums.stream().reduce((a,b)->a*b);
        var resultWithIdentity = nums.stream().reduce(10,(a,b)->a*b);
        result.ifPresent(integer -> System.out.printf("Without Identity: %d \n", integer));

        System.out.printf("With Identity: %d", resultWithIdentity);
    }
}
