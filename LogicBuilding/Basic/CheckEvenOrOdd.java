package DSApractice.LogicBuilding.Basic;

import java.util.Scanner;

public class CheckEvenOrOdd 
{
    public static void main(String[] args)
    {
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();
        inputScanner.close();

        //Using Naive Approach
        if(isEven(number))
        {
            System.out.println("The given number is even");
        }
        else
        {
            System.out.println("The given number is odd");
        }

        //Using Best Case Approach - Expected
        if(isEvenOptimized(number))
        {
            System.out.println("The given number is even");
        }
        else
        {
            System.out.println("The given number is odd");
        }
    }

    //Naive Approach (Time Complexity - O(1) ; Space Complexity - O(1))
    private static boolean isEven(int number) 
    {
        if(number%2==0)
        {
            return true;
        }
        
        return false;
        
    }

    //Best Case Approach (Time Complexity - O(1) ; Space Complexity - O(1))
    private static boolean isEvenOptimized(int number) 
    {
        if((number&1)==0)
        {
            return true;
        }
        
        return false;
    }

}
