package DSApractice.LogicBuilding.Easy;

import java.math.BigInteger;
import java.util.Scanner;

public class FinGCDorHCF 
{
    // Method to find GCD or HCF of two numbers using Euclidean algorithm
    // Time Complexity: O(log(min(a, b)))
    // Space Complexity: O(1)
    public static int findGCD(int a, int b) 
    {
        while (b != 0) 
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Above method can also be implemented using recursion
    // Time Complexity: O(log(min(a, b)))
    // Space Complexity: O(log(min(a, b))) due to recursion call stack
    public static int findGCDRecursive(int a, int b) 
    {
        if (b == 0) 
        {
            return a;
        }
        return findGCDRecursive(b, a % b);
    }

    // Method to find GCD or HCF of two numbers using subtraction method
    // Time Complexity: O(max(a, b)) in the worst case when numbers are consecutive integers (Fibonacci numbers)
    // Space Complexity: O(1)
    public static int findGCDBySubtraction(int a, int b) 
    {
        while (a != b) 
        {
            if (a > b) 
            {
                a = a - b;
            } 
            else 
            {
                b = b - a;
            }
        }
        return a;
    }

    // Method to find GCD or HCF of two numbers using built-in function
    // Time Complexity: O(log(min(a, b)))
    // Space Complexity: O(1)
    public static int findGCDUsingBuiltIn(int a, int b) 
    {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        int gcd = findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

        gcd = findGCDRecursive(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " using recursion is: " + gcd);

        gcd = findGCDBySubtraction(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " using subtraction method is: " + gcd);

        gcd = findGCDUsingBuiltIn(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " using built-in function is: " + gcd);
        
    }
}
