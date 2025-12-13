package DSApractice.LogicBuilding.Easy;

import java.util.Scanner;

public class NthFibonacci 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int nthFibonacci = findNthFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci);

        int[] memo = new int[n + 1];
        nthFibonacci = findNthFibonacciMemoization(n, memo);
        System.out.println("The " + n + "th Fibonacci number (using memoization) is: " + nthFibonacci);

        nthFibonacci = findNthFibonacciRecursive(n);
        System.out.println("The " + n + "th Fibonacci number (using recursion) is: " + nthFibonacci);

        nthFibonacci = findNthFibonacciDP(n);
        System.out.println("The " + n + "th Fibonacci number (using DP) is: " + nthFibonacci);
    }

    // Method to find the Nth Fibonacci number using iterative approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static int findNthFibonacci(int n) 
    {
        if (n <= 1) return n; // Fibonacci sequence is not defined for non-positive integers
       
        int a = 0; // First Fibonacci number
        int b = 1; // Second Fibonacci number
        int fib = 0;

        for (int i = 2; i <= n; i++) 
        {
            fib = a + b; // Calculate the next Fibonacci number
            a = b;       // Update a to the previous Fibonacci number
            b = fib;     // Update b to the current Fibonacci number
        }

        return fib;
    }

    // Recursive approach (not recommended for large n due to exponential time complexity)
    // Time Complexity: O(2^n)
    // Space Complexity: O(n) due to recursion call stack
    private static int findNthFibonacciRecursive(int n) 
    {
        if (n <= 1) return n;
        return findNthFibonacciRecursive(n - 1) + findNthFibonacciRecursive(n - 2);
    }

    // Memoization approach
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    private static int findNthFibonacciMemoization(int n, int[] memo) 
    {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        memo[n] = findNthFibonacciMemoization(n - 1, memo) + findNthFibonacciMemoization(n - 2, memo);
        return memo[n];
    }

    // DP approach
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    private static int findNthFibonacciDP(int n) 
    {
        if (n <= 1) return n;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; ++i) 
        {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

}