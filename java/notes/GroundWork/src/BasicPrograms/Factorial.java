package BasicPrograms;

public class Factorial {
    public static void main(String[] args) {
        int res = calculateFactorial(-4);
        System.out.println(res);
    }

    public static int calculateFactorial(int number) {
        int prod = 1;
        
        if(number < 0) return -1;

        while(number > 0) {
            prod *= number--;
        }
        return prod;
    }
}
