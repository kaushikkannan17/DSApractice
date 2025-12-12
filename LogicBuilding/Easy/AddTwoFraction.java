package DSApractice.LogicBuilding.Easy;

import java.util.Scanner;

public class AddTwoFraction 
{
    // Method to add two fractions and return the result in simplest form
    // Time Complexity: O(log(min(numerator1, denominator1, numerator2, denominator2))) due to GCD calculation
    // Space Complexity: O(1)
    public static int[] addFractions(int numerator1, int denominator1, int numerator2, int denominator2) 
    {
        int commonDenominator = denominator1 * denominator2;
        int newNumerator = (numerator1 * denominator2) + (numerator2 * denominator1);

        int gcd = findGCD(newNumerator, commonDenominator);

        return new int[] { newNumerator / gcd, commonDenominator / gcd };
    }

    // Helper method to find GCD using Euclidean algorithm
    private static int findGCD(int a, int b) 
    {
        while (b != 0) 
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator and denominator of first fraction: ");
        int numerator1 = scanner.nextInt();
        int denominator1 = scanner.nextInt();
        System.out.print("Enter numerator and denominator of second fraction: ");
        int numerator2 = scanner.nextInt();
        int denominator2 = scanner.nextInt();
        scanner.close();

        int[] result = addFractions(numerator1, denominator1, numerator2, denominator2);
        System.out.println("Sum of fractions: " + result[0] + "/" + result[1]);
    }

}
