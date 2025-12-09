package DSApractice.LogicBuilding.Basic;

import java.util.Scanner;

public class SumOfNnaturals 
{
    public static void main(String[] args)
    {
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();
        inputScanner.close();

        //Using Iterative Approach
        int sum = sumOfNNaturalsIterative(number);
        System.out.println("The sum of first " + number + " natural numbers is: " + sum);

        //Using Recursive Approach
        sum = sumOfNNaturalsRecursive(number);
        System.out.println("The sum of first " + number + " natural numbers is: " + sum);

        //Using Formula Based Approach
        sum = sumOfNNaturalsFormulaBased(number);
        System.out.println("The sum of first " + number + " natural numbers is: " + sum);
    }

    //Formula Based Approach (Time Complexity - O(1) ; Space Complexity - O(1))
    private static int sumOfNNaturalsFormulaBased(int number) 
    {
        return (number * (number + 1)) / 2;
    }

    //Recursive Approach (Time Complexity - O(n) ; Space Complexity - O(n))
    private static int sumOfNNaturalsRecursive(int number) 
    {
        if (number == 1) {
            return 1;
        }
        return number + sumOfNNaturalsRecursive(number - 1);
    }

    //Iterative Approach (Time Complexity - O(n) ; Space Complexity - O(1))
    private static int sumOfNNaturalsIterative(int number) 
    {
        int sum = 0;
        for(int i=1; i<=number; i++)
        {
            sum += i;
        }
        return sum;
    }

}
