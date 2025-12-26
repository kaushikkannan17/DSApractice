package DSApractice.LogicBuilding.FrequentlyAsked;

public class PrintEvenOrOddNumbersFromArray 
{
    public static void main(String[] args) 
    {
        int[] numbers = {10, 15, 22, 33, 40, 55, 60};
        
        System.out.println("Even Numbers:");
        printEvenNumbers(numbers);
        
        System.out.println("Odd Numbers:");
        printOddNumbers(numbers);
    }

    // Approach to print even numbers from the array
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static void printEvenNumbers(int[] arr) 
    {
        for(int num : arr)
        {
            if(num % 2 == 0)
            {
                System.out.println(num);
            }
        }
    }

    // Approach to print odd numbers from the array
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static void printOddNumbers(int[] arr) 
    {
        for(int num : arr)
        {
            if(num % 2 != 0)
            {
                System.out.println(num);
            }
        }
    }

}
