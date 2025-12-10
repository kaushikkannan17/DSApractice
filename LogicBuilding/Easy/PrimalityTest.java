package DSApractice.LogicBuilding.Easy;

import java.util.Scanner;

public class PrimalityTest 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        
        if (isPrime(number)) 
        {
            System.out.println(number + " is a prime number.");
        } 
        else 
        {
            System.out.println(number + " is not a prime number.");
        }

        if (isPrimeOptimized(number))

        {
            System.out.println(number + " is a prime number.");
        } 
        else 
        {
            System.out.println(number + " is not a prime number.");
        }


    }

    // Optimized method to check for primality
    // Time Complexity: O(√n)
    // Space Complexity: O(1)
    private static boolean isPrimeOptimized(int number) 
    {
        if (number <= 1) 
        {
            return false;
        }
        if (number == 2 || number == 3) 
        {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) 
        {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) 
        {
            if (number % i == 0 || number % (i + 2) == 0) 
            {
                return false;
            }
        }
        return true;
    }

    // Basic method to check for primality
    // Time Complexity: O(√n)
    // Space Complexity: O(1)
    private static boolean isPrime(int number) 
    {
        if (number <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0) 
            {
                return false;
            }
        }
        return true;        
    }

}
