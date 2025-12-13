package DSApractice.LogicBuilding.Easy;

import java.util.Scanner;

public class DecimalToBinary 
{
    // Method to convert decimal to binary using recursion
    // Time Complexity: O(log2 n)
    // Space Complexity: O(log2 n) due to recursion call stack
    public static String decimalToBinaryRecursion(int number) 
    {
        if (number <= 1) return String.valueOf(number);
        
        return decimalToBinaryRecursion(number / 2) + (number % 2);
    }

    // Method to convert decimal to binary using iterative approach
    // Time Complexity: O(log2 n)
    // Space Complexity: O(1)
    public static String decimalToBinaryIterative(int number)
    {
        if (number == 0) 
        {
            return "0";
        }

        StringBuilder binaryStr = new StringBuilder();
        while (number > 0) 
        {
            int remainder = number % 2;
            binaryStr.insert(0, remainder);
            number /= 2;
        }
        return binaryStr.toString();
    }

    //Bitwise method
    // Time Complexity: O(log2 n)
    // Space Complexity: O(1)
    public static String decimalToBinaryBitwise(int number)
    {
        if (number == 0) 
        {
            return "0";
        }

        StringBuilder binaryStr = new StringBuilder();
        while (number > 0) 
        {
            int bit = number & 1;
            binaryStr.insert(0, bit);
            number >>= 1;
        }
        return binaryStr.toString();
    }

    // Built-in method
    // Time Complexity: O(log2 n)
    // Space Complexity: O(1)
    public static String decimalToBinaryBuiltIn(int number)
    {
        return Integer.toBinaryString(number);
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        String binaryRecursion = decimalToBinaryRecursion(number);
        System.out.println("Binary (Recursion): " + binaryRecursion);

        String binaryIterative = decimalToBinaryIterative(number);
        System.out.println("Binary (Iterative): " + binaryIterative);

        String binaryBitwise = decimalToBinaryBitwise(number);
        System.out.println("Binary (Bitwise): " + binaryBitwise);

        String binaryBuiltIn = decimalToBinaryBuiltIn(number);
        System.out.println("Binary (Built-in): " + binaryBuiltIn);
    }

}
