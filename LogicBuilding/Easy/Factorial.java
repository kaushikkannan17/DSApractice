package DSApractice.LogicBuilding.Easy;

import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        long factorial = calculateFactorialIterative(number);
        System.out.println("Factorial (iterative): " + factorial);

        factorial = calculateFactorialRecursive(number);
        System.out.println("Factorial (recursive): " + factorial);
    }

    // Method to calculate factorial iteratively
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static long calculateFactorialIterative(int number) 
    {
        long result = 1;
        for (int i = 2; i <= number; i++) 
        {
            result *= i;
        }
        return result;
    }

    // Method to calculate factorial recursively
    // Time Complexity: O(n)
    // Space Complexity: O(n) due to recursion call stack
    private static long calculateFactorialRecursive(int number) 
    {
        // Base case
        if (number == 0 || number == 1) 
        {
            return 1;
        }
        // Recursive case
        return number * calculateFactorialRecursive(number - 1);
    }

}
