package JavaBasics;

public class PrimitiveTypes {
    public static void main(String[] args) {
        /*
        Type                representation                  Range                           Bits
        byte                b=5                             -128 - 127                      8
        short               s=128                           -32768 - 32767                  16
        int                 i=4000                          -2.14*10^9 - 2.14*10^9          32
        long                l=22222222222                   -9.22*10^18 - 9.22*10^18        64
        float               f=0.4f;
        double              d=67.0
        char                c='A'
        boolean             isTrue=false
         */

        /*
        Decimal and float are not very precise so not recommended for financials
        Use BigDecimal instead
         */
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        // sum of two different types is always represented by bigger type
        var sumOfIntAndFloat = 5 + 5.0F;
        System.out.println(sumOfIntAndFloat); // 10.0

        //Character
        char ch = 'A';
        System.out.println((int)ch); // 65

        ch += 10;
        System.out.println(ch); // K
    }
}
