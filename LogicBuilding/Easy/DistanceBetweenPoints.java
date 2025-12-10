package DSApractice.LogicBuilding.Easy;

import java.util.Scanner;

public class DistanceBetweenPoints 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Integer x1 = scanner.nextInt();
        Integer y1 = scanner.nextInt();
        Integer x2 = scanner.nextInt();
        Integer y2 = scanner.nextInt();
        scanner.close();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Distance between points: " + distance);
    }

    // Method to calculate distance between two points (x1, y1) and (x2, y2)
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    private static double calculateDistance(Integer x1, Integer y1, Integer x2, Integer y2) 
    {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); //Pythagorean theorem
    }

}
