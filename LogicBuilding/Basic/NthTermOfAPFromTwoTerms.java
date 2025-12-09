package DSApractice.LogicBuilding.Basic;

import java.util.Scanner;

public class NthTermOfAPFromTwoTerms 
{
    public static void main(String[] args)
    {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter first term of AP: ");
        int firstTerm = inputScanner.nextInt(); 
        System.out.print("Enter second term of AP: ");
        int secondTerm = inputScanner.nextInt();
        System.out.print("Enter the term position to find: ");
        int n = inputScanner.nextInt();
        inputScanner.close();

        //Using Loop Based Approach
        int nthTermLoop = findNthTermOfAPLoop(firstTerm, secondTerm, n);
        System.out.println("Using Loop Based Approach: The " + n + "th term of the AP is: " + nthTermLoop);

        //Using Formula Based Approach
        int nthTerm = findNthTermOfAPFormula(firstTerm, secondTerm, n);
        System.out.println("The " + n + "th term of the AP is: " + nthTerm);
        
    }

    //Using Formula Based Approach (Time Complexity - O(1) ; Space Complexity - O(1))
    private static int findNthTermOfAPFormula(int firstTerm, int secondTerm, int n) 
    {
        int commonDifference = secondTerm - firstTerm;
        return firstTerm + (n - 1) * commonDifference;
    }

    //Using Loop Based Approach (Time Complexity - O(n) ; Space Complexity - O(1))
    private static int findNthTermOfAPLoop(int firstTerm, int secondTerm, int n) 
    {
        int commonDifference = secondTerm - firstTerm;
        int nthTerm = firstTerm;
        for(int i=2; i<=n; i++)
        {
            nthTerm += commonDifference;
        }
        return nthTerm;
    }

}
