package org.learn.concepts;

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
    }
}
