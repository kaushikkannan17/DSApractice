package DSApractice.LogicBuilding.Basic;

import java.util.Scanner;

public class SumOfSquaresOfNaturals 
{
    public static void main(String[] args)
    {
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();
        inputScanner.close();
        
        //Using Iterative Approach
        int sum = sumOfSquaresOfNNaturalsIterative(number);
        System.out.println("The sum of squares of first " + number + " natural numbers is: " + sum);

        //Using Formula Based Approach
        sum = sumOfSquaresOfNNaturalsFormulaBased(number);
        System.out.println("The sum of squares of first " + number + " natural numbers is: " + sum);
    }

    //Formula Based Approach (Time Complexity - O(1) ; Space Complexity - O(1))
    private static int sumOfSquaresOfNNaturalsFormulaBased(int number) 
    {
        return ((number * (number + 1)/2) * (2 * number + 1)/3);
    }

    //Iterative Approach (Time Complexity - O(n) ; Space Complexity - O(1))
    private static int sumOfSquaresOfNNaturalsIterative(int number) 
    {
        int sum = 0;
        for(int i=1; i<=number; i++)
        {
            sum += i * i;
        }
        return sum;
    }


}
