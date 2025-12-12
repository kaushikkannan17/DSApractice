package DSApractice.LogicBuilding.Easy;

public class FindLCM 
{
    // Method to find LCM of two numbers using GCD
    // Time Complexity: O(log(min(a, b))) due to GCD calculation
    // Space Complexity: O(1)
    public static int findLCM(int a, int b) 
    {
        return (a * b) / findGCD(a, b);
    }

    // Helper method to find GCD using Euclidean algorithm
    private static int findGCD(int a, int b) 
    {
        while (b != 0) 
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) 
    {
        int num1 = 12;
        int num2 = 15;

        int lcm = findLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

}
