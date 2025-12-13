package DSApractice.LogicBuilding.Easy;

import java.util.Scanner;

public class ArmstrongNumber 
{
    // Method to check if a number is an Armstrong number
    // Time Complexity: O(d) where d = number of digits = Θ(log10 n)
    // Space Complexity: O(1)
    public static boolean isArmstrongNumber(int number) 
    {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) 
        {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();
        
        if (isArmstrongNumber(number)) 
        {
            System.out.println(number + " is an Armstrong number.");
        } 
        else 
        {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

}
