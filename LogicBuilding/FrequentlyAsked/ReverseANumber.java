package DSApractice.LogicBuilding.FrequentlyAsked;

public class ReverseANumber 
{
    public static void main(String[] args) 
    {
        int number = 12345;
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    // Approach using mathematical operations
    // Time Complexity: O(n) where n is the number of digits
    // Space Complexity: O(1)
    private static int reverseNumber(int num) 
    {
        int reversed = 0;
        while(num != 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    // Another Approach using StringBuilder
    // Time Complexity: O(n) where n is the number of digits
    // Space Complexity: O(n) for the StringBuilder
    // return Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());

}
