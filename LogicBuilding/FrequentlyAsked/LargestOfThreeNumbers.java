package DSApractice.LogicBuilding.FrequentlyAsked;

public class LargestOfThreeNumbers 
{
    public static void main(String[] args) 
    {
        int a = 10, b = 20, c = 15;
        int largest = findLargest(a, b, c);
        System.out.println("The largest number is: " + largest);
    }

    // Approach using conditional statements
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    private static int findLargest(int a, int b, int c) 
    {
        if(a >= b && a >= c)
        {
            return a;
        }
        else if(b >= a && b >= c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }

    // Another Approach using Math.max
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    // private static int findLargest(int a, int b, int c)
    // {
    //     return Math.max(a, Math.max(b, c));
    // }
}
