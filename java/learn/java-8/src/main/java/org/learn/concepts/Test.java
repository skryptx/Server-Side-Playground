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
    }
}
