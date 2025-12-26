package DSApractice.LogicBuilding.FrequentlyAsked;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements 
{
    public static void main(String[] args) 
    {
        // store common elements between two arrays and sort them

        int[] arr1 = {4, 5, 6, 7, 8};
        int[] arr2 = {1, 2, 3, 5, 8, 7, 4};

        ArrayList<Integer> sortedCommonElements =  fetchCommonElements(arr1, arr2);
        System.out.println("Common elements in sorted order: " + sortedCommonElements);
    }

    private static ArrayList<Integer> fetchCommonElements(int[] arr1, int[] arr2) 
    {
        ArrayList<Integer> commonElements = new ArrayList<>();

        for(int i = 0; i < arr1.length; i++)
        {
            for(int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == arr2[j] && !commonElements.contains(arr1[i]))
                {
                    commonElements.add(arr1[i]);
                }
            }
        }

        commonElements.sort(null); // Sort the list in natural order
        return commonElements;
    }

    // An alternate approach using sorting and two pointers
    // This approach is more efficient than the above nested loops
    // Time Complexity: O(n log n + m log m) due to sorting
    // Space Complexity: O(k) where k is the number of common elements
    private static ArrayList<Integer> fetchCommonElementsAnotherApproach(int[] arr1, int[] arr2) 
    {
        ArrayList<Integer> commonElementList = new ArrayList<>();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]==arr2[j])
            {
                commonElementList.add(arr1[i]);
                i++;j++;
            }
            else if(arr1[i]>arr2[j]) j++;
            else i++;
        }
        
        return commonElementList;
    }
}
