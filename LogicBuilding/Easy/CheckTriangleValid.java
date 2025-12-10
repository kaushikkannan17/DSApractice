package DSApractice.LogicBuilding.Easy;

import java.util.Scanner;

public class CheckTriangleValid 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

         // Check if the sides can form a valid triangle

        if (isValidTriangle(a, b, c)) 
        {
            System.out.println("The sides form a valid triangle.");
        } 
        else 
        {
            System.out.println("The sides do not form a valid triangle.");
        }
    }

    // Method to check if three sides can form a valid triangle
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    private static boolean isValidTriangle(int a, int b, int c) 
    {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

}
