package org.learn.concepts;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static int add(int... args) {
        int sum = 0;
        for(int i: args) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println(add(nums));

        List<Integer> numsList = Arrays.asList(1,2,3);
        numsList.set(1,5);
        numsList.sort(Integer::compareTo);
        System.out.println(numsList);
    }
}
