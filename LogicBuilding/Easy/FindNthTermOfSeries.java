package DSApractice.LogicBuilding.Easy;

import java.util.Scanner;

public class FindNthTermOfSeries 
{
    //Sum of n natural numbers

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int nthTerm = findNthTermOfSeries(n);
        System.out.println("The " + n + "th term of the series is: " + nthTerm);

        nthTerm = findNthTermOfSeriesLoop(n);
        System.out.println("The " + n + "th term of the series (using loop) is: " + nthTerm);
    }

    //Method to find the Nth term of the series using direct formula
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    private static int findNthTermOfSeries(int n) 
    {
        return n * (n + 1)/2;
    }

    //Method to find the Nth term of the series using loop
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static int findNthTermOfSeriesLoop(int n) 
    {
        int term = 0;
        for (int i = 1; i <= n; i++) 
        {
            term += i;
        }
        return term;
    }

}
