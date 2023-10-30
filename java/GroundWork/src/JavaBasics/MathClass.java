package JavaBasics;

public class MathClass {
    public static void main(String[] args) {
        // type cast from double to int by
        System.out.println((int)Math.sqrt(25));

        // String to int can be done via Integer parse int function
        System.out.println(Integer.parseInt("1000"));

        /*
        double -> float -> long -> int -> short -> byte
        In the order shown above
        1. left to right conversion may lead to data loss
        2. right to left conversion is implicit and no loss of data
         */

        double doubleToInt = 5.5;
        int intVal = (int) doubleToInt;
        System.out.println(intVal);
    }
}
