package JavaBasics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] marks = new int[] {1,2,3,4,5};
        Array.setInt(marks, 3, 321); // sets the index 3 element of array marks to 321
        System.out.println(Arrays.toString(marks));
        for (var mark: marks) {
            System.out.println(mark);
        }
    }
}
