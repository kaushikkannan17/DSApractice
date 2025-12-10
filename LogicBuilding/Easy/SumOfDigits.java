package DSApractice.LogicBuilding.Easy;

import java.util.Scanner;

public class SumOfDigits 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int sum = findSumOfDigitsByExtraction(number);
        System.out.println("Sum of digits by extraction: " + sum);

        sum = findSumOfDigitsByRecursion(number);
        System.out.println("Sum of digits by recursion: " + sum);

        sum = findSumOfDigitsByStringConversion(number);
        System.out.println("Sum of digits by string conversion: " + sum);
    }

    // Method to find sum of digits by converting number to string
    // Time Complexity: O(d) where d = number of digits = Θ(log10 n)
    // Space Complexity: O(d)
    private static int findSumOfDigitsByStringConversion(int number) 
    {
        String numberStr = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < numberStr.length(); i++) 
        {
            char digitChar = numberStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            sum += digit;
        }
        return sum;
    }

    // Method to find sum of digits by recursion
    // Time Complexity: O(d) where d = number of digits = Θ(log10 n)
    // Space Complexity: O(d) due to recursion call stack
    private static int findSumOfDigitsByRecursion(int number) 
    {
        // Base case: if number is 0, return 0
        if (number == 0) 
        {
            return 0;
        }
        // Recursive case: add last digit to sum of remaining digits
        return (number % 10) + findSumOfDigitsByRecursion(number / 10);
    }

    // Method to find sum of digits by extracting each digit
    // Time Complexity: O(d) where d = number of digits = Θ(log10 n)
    // Space Complexity: O(1)
    private static int findSumOfDigitsByExtraction(int number) 
    {
        int sum = 0;
        while (number != 0) 
        {
            int digit = number % 10; // Extract the last digit
            sum += digit;            // Add it to the sum
            number /= 10;           // Remove the last digit
        }
        return sum;
    }

}
