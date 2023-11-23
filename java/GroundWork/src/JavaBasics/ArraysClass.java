package JavaBasics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] marks = new int[] {1,2,3,4,5};
        Array.setInt(marks, 3, 321); // sets the index 3 element of array marks to 321
        System.out.println(Arrays.toString(marks));

        int[] marks1 = {200,200,200,100,200};
        Arrays.fill(marks, 200); // initialize all array elements with 200
        System.out.println(Arrays.toString(marks));
        int[] marks2 = {200,200,200,100,200};
        System.out.println(Arrays.equals(marks1, marks2)); //false, checks the order as well

        String[] names = {"200"};
    }
}
