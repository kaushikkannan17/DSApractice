package DSApractice.LogicBuilding.Easy;

import java.util.Scanner;

public class CheckRectanglesOverlap 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter coordinates of rectangle 1 (x1 y1 x2 y2):");
        int rect1_x1 = scanner.nextInt();
        int rect1_y1 = scanner.nextInt();
        int rect1_x2 = scanner.nextInt();
        int rect1_y2 = scanner.nextInt();
        
        System.out.println("Enter coordinates of rectangle 2 (x1 y1 x2 y2):");
        int rect2_x1 = scanner.nextInt();
        int rect2_y1 = scanner.nextInt();
        int rect2_x2 = scanner.nextInt();
        int rect2_y2 = scanner.nextInt();
        
        scanner.close();
        
        if (doRectanglesOverlap(rect1_x1, rect1_y1, rect1_x2, rect1_y2,
                                rect2_x1, rect2_y1, rect2_x2, rect2_y2)) 
        {
            System.out.println("Rectangles overlap.");
        } 
        else 
        {
            System.out.println("Rectangles do not overlap.");
        }
    }

    // Method to check if two rectangles overlap
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    private static boolean doRectanglesOverlap(int r1_x1, int r1_y1, int r1_x2, int r1_y2,
                                               int r2_x1, int r2_y1, int r2_x2, int r2_y2) 
    {
        // If one rectangle is on left side of other
        if (r1_x1 >= r2_x2 || r2_x1 >= r1_x2) 
        {
            return false;
        }

        // If one rectangle is above other
        if (r1_y2 >= r2_y1 || r2_y2 >= r1_y1) 
        {
            return false;
        }

        return true;
    }

}
