package DSApractice.LogicBuilding.FrequentlyAsked;

public class FactorialOfNumber 
{
    public static void main(String[] args) 
    {
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Approach using iterative method
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static long calculateFactorial(int num) 
    {
        long result = 1;
        for(int i = 1; i <= num; i++)
        {
            result *= i;
        }
        return result;
    }

    // Another Approach using recursion
    // Time Complexity: O(n)
    // Space Complexity: O(n) due to recursive call stack
    // private static long calculateFactorial(int num)
    // {
    //     if(num == 0 || num == 1)
    //     {
    //         return 1;
    //     }
    //     return num * calculateFactorial(num - 1);
    // }

}
