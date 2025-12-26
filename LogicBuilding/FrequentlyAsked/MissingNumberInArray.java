package DSApractice.LogicBuilding.FrequentlyAsked;

public class MissingNumberInArray 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6; // The range is from 1 to n
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }

    // Approach using the formula for the sum of first n natural numbers
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static int findMissingNumber(int[] arr, int n) 
    {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for(int num : arr)
        {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    // Another Approach using XOR
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // private static int findMissingNumber(int[] arr, int n)
    // {
    //     int xorFull = 0;
    //     int xorArray = 0;
    //     for(int i = 1; i <= n; i++)
    //     {
    //         xorFull ^= i;
    //     }
    //     for(int num : arr)
    //     {
    //         xorArray ^= num;
    //     }
    //     return xorFull ^ xorArray;
    // }

}
