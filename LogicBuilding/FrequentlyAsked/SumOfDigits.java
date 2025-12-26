package DSApractice.LogicBuilding.FrequentlyAsked;

public class SumOfDigits 
{
    public static void main(String[] args) 
    {
        int number = 12345;
        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of Digits: " + sum);
    }

    // Approach using mathematical operations
    // Time Complexity: O(n) where n is the number of digits
    // Space Complexity: O(1)
    private static int calculateSumOfDigits(int num) 
    {
        int sum = 0;
        while(num != 0)
        {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Another Approach using String conversion
    // Time Complexity: O(n) where n is the number of digits
    // Space Complexity: O(1)
    // private static int calculateSumOfDigits(int num) 
    // {
    //     String numStr = String.valueOf(num);
    //     int sum = 0;
    //     for(char ch : numStr.toCharArray())
    //     {
    //         sum += Character.getNumericValue(ch);
    //     }
    //     return sum;
    // }

}
