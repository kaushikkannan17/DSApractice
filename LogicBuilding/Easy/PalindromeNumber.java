package DSApractice.LogicBuilding.Easy;

public class PalindromeNumber 
{
    // Method to check if a number is a palindrome
    // Time Complexity: O(d) where d = number of digits = Θ(log10 n)
    // Space Complexity: O(1)
    public static boolean isPalindrome(int number) 
    {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) 
        {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) 
    {
        int number = 121; // Example number to check

        if (isPalindrome(number)) 
        {
            System.out.println(number + " is a palindrome.");
        } 
        else 
        {
            System.out.println(number + " is not a palindrome.");
        }
    }

}
