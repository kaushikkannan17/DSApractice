package DSApractice.LogicBuilding.FrequentlyAsked;

public class FindDuplicatesInArray 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 2, 5, 3, 6, 1};
        System.out.println("Duplicate elements in the array:");
        findDuplicates(arr);
    }

    // Approach using nested loops
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    private static void findDuplicates(int[] arr) 
    {
        boolean foundDuplicate = false;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[i]);
                    foundDuplicate = true;
                    break; // To avoid printing the same duplicate multiple times
                }
            }
        }
        if(!foundDuplicate)
        {
            System.out.println("No duplicates found.");
        }
    }

    // Another Approach using HashSet
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // private static void findDuplicates(int[] arr)
    // {
    //     Set<Integer> seen = new HashSet<>();
    //     Set<Integer> duplicates = new HashSet<>();
    //     for(int num : arr)
    //     {
    //         if(seen.contains(num))
    //         {
    //             duplicates.add(num);
    //         }
    //         else
    //         {
    //             seen.add(num);
    //         }
    //     }
    //     if(duplicates.isEmpty())
    //     {
    //         System.out.println("No duplicates found.");
    //     }
    //     else
    //     {
    //         for(int dup : duplicates)
    //         {
    //             System.out.println(dup);
    //         }
    //     }
    // }

}
