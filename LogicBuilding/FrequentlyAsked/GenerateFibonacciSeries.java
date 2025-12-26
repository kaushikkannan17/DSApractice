package DSApractice.LogicBuilding.FrequentlyAsked;

public class GenerateFibonacciSeries 
{
    public static void main(String[] args) 
    {
        int n = 10; // Number of terms in Fibonacci series
        generateFibonacci(n);
    }

    // Approach to generate Fibonacci series
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static void generateFibonacci(int n) 
    {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + ", " + b);
        for(int i = 2; i < n; i++)
        {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Another Approach using Recursion (not efficient for large n)
    // Time Complexity: O(2^n)
    // Space Complexity: O(n) due to recursion stack
    // private static int fibonacci(int n)
    // {
    //     if(n <= 1)
    //     {
    //         return n;
    //     }
    //     return fibonacci(n - 1) + fibonacci(n - 2);
    // }

}
