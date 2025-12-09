package DSApractice.LogicBuilding.Basic;

import java.util.Scanner;

public class ClosestNumberDivisible 
{
    public static void main(String[] args)
    {
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();
        int divisor = inputScanner.nextInt();
        inputScanner.close();

        //Using Iterative Approach to find Closest Number Divisible
        int closestNumber = findClosestNumberDivisible(number, divisor);
        System.out.println("The closest number to " + number + " that is divisible by " + divisor + " is: " + closestNumber);

        //Using Quotient-Remainder Approach to find Closest Number Divisible
        closestNumber = findClosestNumberDivisibleUsingQR(number, divisor);
        System.out.println("The closest number to " + number + " that is divisible by " + divisor + " is: " + closestNumber);
        
    }

    //Quotient-Remainder Approach (Time Complexity - O(1) ; Space Complexity - O(1))
    private static int findClosestNumberDivisibleUsingQR(int number, int divisor) 
    {
        int remainder = number % divisor;

        if(remainder == 0)
        {
            return number;
        }

        int lowerMultiple = number - remainder;
        int higherMultiple = lowerMultiple + Math.abs(divisor);

        if(Math.abs(number - lowerMultiple) <= Math.abs(higherMultiple - number))
        {
            return lowerMultiple;
        }
        else
        {
            return higherMultiple;
        }
    }

    //Iterative Approach (Time Complexity - O(n) ; Space Complexity - O(1))
    private static int findClosestNumberDivisible(int number, int divisor) 
    {
        int closestNumber = 0;
        int minDifference = Integer.MAX_VALUE;

        for(int index = number - Math.abs(divisor); index<=number + Math.abs(divisor) ; ++index)
        {
            if(index % divisor == 0)
            {
                int difference = Math.abs(number - index);
                
                if(difference < minDifference || (difference == minDifference && index < closestNumber))
                {
                    minDifference = difference;
                    closestNumber = index;
                }
            }
        }
        
        return closestNumber;
    }

}
