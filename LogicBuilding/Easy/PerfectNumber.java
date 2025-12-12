package DSApractice.LogicBuilding.Easy;

import java.util.Scanner;

public class PerfectNumber 
{
    // Method to check if a number is a perfect number
    // Time Complexity: O(sqrt(n))
    // Space Complexity: O(1)
    public static boolean isPerfectNumber(int number) 
    {
        if (number < 2) 
        {
            return false;
        }

        int sumOfDivisors = 1; // 1 is a proper divisor

        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0) 
            {
                sumOfDivisors += i;
                if (i != number / i) 
                {
                    sumOfDivisors += number / i;
                }
            }
        }

        return sumOfDivisors == number;
    }

    // Method to check if a number is a perfect number
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static boolean isPerfectNumberBruteForce(int number)
    {
        int sumOfDivisors = 0;

        for (int i = 1; i < number; i++) 
        {
            if (number % i == 0) 
            {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == number;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (isPerfectNumber(number)) 
        {
            System.out.println(number + " is a perfect number.");
        } 
        else 
        {
            System.out.println(number + " is not a perfect number.");
        }
    }

}
