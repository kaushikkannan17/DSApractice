package DSApractice.LogicBuilding.FrequentlyAsked;

public class MaxAndMinValuesInArray 
{
    public static void main(String[] args) 
    {
        int[] arr = {3, 5, 1, 8, 2, -4, 7};
        int max = findMax(arr);
        int min = findMin(arr);
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }

    // Approach to find maximum value in the array
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static int findMax(int[] arr) 
    {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    // Approach to find minimum value in the array
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static int findMin(int[] arr) 
    {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    // Another Approach using Java Streams
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    
    // private static int findMax(int[] arr)
    // {
    //     return Arrays.stream(arr).max().getAsInt();
    // }

    // private static int findMin(int[] arr)
    // {
    //     return Arrays.stream(arr).min().getAsInt();
    // }

    // Yet Another Approach using Collections
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    
    // private static int findMax(int[] arr)
    // {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     for(int num : arr)
    //     {
    //         list.add(num);
    //     }
    //     return Collections.max(list);
    // }
    
    // private static int findMin(int[] arr)
    // {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     for(int num : arr)
    //     {
    //         list.add(num);
    //     }
    //     return Collections.min(list);
    // }

}
