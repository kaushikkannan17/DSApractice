package DSApractice.LogicBuilding.FrequentlyAsked;

public class SumOfElementsInArray 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = calculateSum(arr);
        System.out.println("Sum of elements in the array: " + sum);
    }

    // Approach using iterative method
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static int calculateSum(int[] array) 
    {
        int sum = 0;
        for(int num : array)
        {
            sum += num;
        }
        return sum;
    }

    // Another Approach using Java Streams
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // private static int calculateSum(int[] array) 
    // {
    //     return Arrays.stream(array).sum();
    // }

}
