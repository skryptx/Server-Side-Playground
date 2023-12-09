package BasicPrograms;

public class ReverseANumber {

    public static void main(String[] args) {
        int res = reverseNumber(-1);
        System.out.println(res);
    }
    public static int reverseNumber(int number) {
        int power = 1;
        int reverse = 0;
        if(number < 0) return -1;
        while(number > 0) {
            int lastDigit = number % 10;
            reverse = (int) (reverse * (Math.pow(10, power))) + lastDigit;
            number = number / 10;
        }
        return reverse;
    }
}
