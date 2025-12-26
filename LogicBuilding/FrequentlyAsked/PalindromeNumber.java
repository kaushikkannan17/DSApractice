package DSApractice.LogicBuilding.FrequentlyAsked;

public class PalindromeNumber 
{
    public static void main(String[] args) 
    {
        int number = 12321;
        if(isPalindromeNumber(number))
        {
            System.out.println(number + " is a Palindrome Number");
        }
        else
        {
            System.out.println(number + " is not a Palindrome Number");
        }
    }

    // Approach using mathematical operations
    // Time Complexity: O(n) where n is the number of digits
    // Space Complexity: O(1)
    private static boolean isPalindromeNumber(int num) 
    {
        int originalNumber = num;
        int reversed = 0;

        while(num != 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return originalNumber == reversed;
    }

    // Another Approach using StringBuilder
    // Time Complexity: O(n) where n is the number of digits
    // Space Complexity: O(n) for the StringBuilder
    // return String.valueOf(num).equals(new StringBuilder(String.valueOf(num)).reverse().toString());
}
