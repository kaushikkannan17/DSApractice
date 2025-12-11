package DSApractice.LogicBuilding.Easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FactorialOfLargerNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a larger number: ");
        Integer number = scanner.nextInt();
        scanner.close();
        
        ArrayList<Integer> factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);

        String factorialBigInt = calculateFactorialUsingBigInteger(number);
        System.out.println("Factorial of " + number + " using BigInteger is: " + factorialBigInt);
    }

    // Method to calculate factorial using BigInteger for large numbers
    // Time Complexity: O(n log n log log n) due to multiplication of large numbers
    // Space Complexity: O(n) for storing the result
    private static String calculateFactorialUsingBigInteger(Integer number) 
    {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= number; i++) 
        {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result.toString();
    }

    // Method to calculate factorial and store each digit in an array
    // Time Complexity: O(n^2) due to digit-by-digit multiplication and carry handling
    // Space Complexity: O(n) for storing the result
    private static ArrayList<Integer> calculateFactorial(Integer number)
    {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1); // Initialize result with 1

        for (int i = 2; i <= number; i++) 
        {
            int carry = 0;
            for (int j = 0; j < result.size(); j++) 
            {
                int product = result.get(j) * i + carry;
                result.set(j, product % 10); // Store last digit
                carry = product / 10; // Update carry
            }
            while (carry != 0) 
            {
                result.add(carry % 10);
                carry /= 10;
            }
        }

        Collections.reverse(result);
        return result;
    }
}

