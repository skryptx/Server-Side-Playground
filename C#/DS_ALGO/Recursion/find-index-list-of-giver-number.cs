// Online C# Editor for free
// Write, Edit and Run your C# code using C# Online Compiler
    
using System;
using System.Collections.Generic;

public class HelloWorld
{
    public static void Main(string[] args)
    {
        Console.WriteLine (String.Join(',',FindIndex(new int[]{1,2,3,4,5,6,4,4}, 4)));
    }
    
    public static List<int> FindIndex(int[] array, int target, int index = 0) {
        if(index == array.Length) {
            return new List<int>();
        }
        List<int> res = FindIndex(array, target, index + 1);
        if(array[index] == target) {
            res.Add(index);
        }
        
        return res;
    }
}