// Online C# Editor for free
// Write, Edit and Run your C# code using C# Online Compiler
    
using System;

public class HelloWorld
{
    public static void Main(string[] args)
    {
        int n = 10034500;
        Console.WriteLine(CountZero(n));
        //Console.WriteLine (RevDigits(n, 3));
    }
    
    public static int RevDigits(int n, int pow) {
        if(n/10 == 0) {
            return n;
        }
        
        int rev = 0;
        rev = (n%10)*(Convert.ToInt32(Math.Pow(10,pow))) + RevDigits(n/10, --pow);
        return rev;
    }
    
    public static int CountZero(int n) {
        if(n == 0) {
            return 0;
        }
        
        int count = 0;
        if(n%10 == 0) {
            count = 1 + CountZero(n/10);
        } else {
            count = CountZero(n/10);
        }
        return count;
    }
}