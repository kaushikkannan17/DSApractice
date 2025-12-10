package DSApractice.LogicBuilding.Easy;

import java.util.Scanner;

public class ReversingDigitsOfNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int reversedNumber = reverseDigitsByExtraction(number);
        System.out.println("Reversed number by extraction: " + reversedNumber);

        reversedNumber = reverseDigitsByStringConversion(number);
        System.out.println("Reversed number by string conversion: " + reversedNumber);
    }

    // Method to reverse digits by converting number to string
    // Time Complexity: O(d) where d = number of digits = Θ(log10 n)
    // Space Complexity: O(d)
    private static int reverseDigitsByStringConversion(int number) 
    {
        String numberStr = Integer.toString(number);
        StringBuilder reversedStr = new StringBuilder(numberStr).reverse();
        return Integer.parseInt(reversedStr.toString());
    }

    // Method to reverse digits by extracting each digit
    // Time Complexity: O(d) where d = number of digits = Θ(log10 n)
    // Space Complexity: O(d)
    private static int reverseDigitsByExtraction(int number) 
    {
        int reversedNumber = 0;
        while (number != 0) 
        {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

}
