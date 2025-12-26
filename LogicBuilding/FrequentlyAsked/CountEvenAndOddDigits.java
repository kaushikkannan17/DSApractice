package DSApractice.LogicBuilding.FrequentlyAsked;

public class CountEvenAndOddDigits 
{
    public static void main(String[] args) 
    {
        int number = 1234567890;
        int[] result = countEvenAndOddDigits(number);
        System.out.println("Even Digits: " + result[0]);
        System.out.println("Odd Digits: " + result[1]);
    }

    // Approach using mathematical operations
    // Time Complexity: O(n) where n is the number of digits
    // Space Complexity: O(1)
    private static int[] countEvenAndOddDigits(int num) 
    {
        int evenCount = 0;
        int oddCount = 0;

        while(num != 0)
        {
            int digit = num % 10;
            if(digit % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
            num /= 10;
        }

        return new int[]{evenCount, oddCount};
    }

    // Another Approach using String conversion
    // Time Complexity: O(n) where n is the number of digits
    // Space Complexity: O(1)
    // int evenCount = 0;
    // int oddCount = 0;
    // String numStr = String.valueOf(num);
    // for(char ch : numStr.toCharArray())
    // {
    //     int digit = ch - '0';
    //     if(digit % 2 == 0)
    //     {
    //         evenCount++;
    //     }
    //     else
    //     {
    //         oddCount++;
    //     }
    // }

}
