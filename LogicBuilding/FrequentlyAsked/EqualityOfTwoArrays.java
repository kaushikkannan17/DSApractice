package DSApractice.LogicBuilding.FrequentlyAsked;

public class EqualityOfTwoArrays 
{
    public static void main(String[] args) 
    {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        boolean areEqual = checkEquality(array1, array2);
        if(areEqual)
        {
            System.out.println("The two arrays are equal.");
        }
        else
        {
            System.out.println("The two arrays are not equal.");
        }
    }

    // Approach to check equality of two arrays
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static boolean checkEquality(int[] arr1, int[] arr2) 
    {
        if(arr1.length != arr2.length)
        {
            return false;
        }

        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] != arr2[i])
            {
                return false;
            }
        }
        return true;
    }

    // Another Approach using Arrays.equals()
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // private static boolean checkEquality(int[] arr1, int[] arr2)
    // {
    //     return Arrays.equals(arr1, arr2);
    // }

}
