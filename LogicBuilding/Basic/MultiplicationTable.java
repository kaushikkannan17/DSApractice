package DSApractice.LogicBuilding.Basic;

import java.util.Scanner;

public class MultiplicationTable 
{
    public static void main(String[] args)
    {
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();
        inputScanner.close();

        //Iterative Approach
        printMultiplicationTable(number);
    }

   //Iterative Approach (Time Complexity - O(1) ; Space Complexity - O(1))
    private static void printMultiplicationTable(int number) 
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(number + " x " + i + " = " + (number*i));
        }
    }

}
