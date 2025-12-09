package DSApractice.LogicBuilding.Basic;

import java.util.Scanner;

public class DiceProblem 
{
    // Given a number from the face of a dice, return the number on the opposite face.
    // The opposite faces of a dice always add up to 7.
    public static void main(String[] args) 
    {
        Scanner inputScanner = new Scanner(System.in);
        int faceValue = inputScanner.nextInt();
        inputScanner.close();

        //Using Direct Calculation Approach (Time Complexity - O(1) ; Space Complexity - O(1))
        int oppositeFaceValue = getOppositeFaceValue(faceValue);
        System.out.println("The opposite face value of " + faceValue + " is: " + oppositeFaceValue);

        //Using Switch Case Approach (Time Complexity - O(1) ; Space Complexity - O(1))
        oppositeFaceValue = getOppositeFaceValueUsingSwitch(faceValue);
        System.out.println("The opposite face value of " + faceValue + " is: " + oppositeFaceValue);
        
    }

    private static int getOppositeFaceValueUsingSwitch(int faceValue) 
    {
        switch (faceValue) 
        {
            case 1:
                return 6;
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 2;
            case 6:
                return 1;
            default:
                return -1; // Invalid face value
        }
    }

    private static int getOppositeFaceValue(int faceValue) 
    {
        if(faceValue < 1 || faceValue > 6)
        {
            return -1; // Invalid face value
        }

        return 7 - faceValue;
    }

}
