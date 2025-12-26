package DSApractice.LogicBuilding.FrequentlyAsked;

public class NumberOfDigits 
{
    public static void main(String[] args) 
    {
        int number = 12345;
        int digitCount = countDigits(number);
        System.out.println("Number of Digits: " + digitCount);
    }

    // Approach using mathematical operations
    // Time Complexity: O(n) where n is the number of digits
    // Space Complexity: O(1)
    private static int countDigits(int num) 
    {
        int count = 0;
        while(num != 0)
        {
            num /= 10;
            count++;
        }
        return count;
    }

    // Another Approach using String conversion
    // Time Complexity: O(n) where n is the number of digits
    // Space Complexity: O(1)
    // return String.valueOf(num).length();
}
