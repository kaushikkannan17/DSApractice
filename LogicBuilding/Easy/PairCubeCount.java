package DSApractice.LogicBuilding.Easy;

import java.util.Scanner;

public class PairCubeCount 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        int pairCount = countCubePairs(n);
        System.out.println("Number of pairs (a, b) such that a^3 + b^3 <= " + n + " is: " + pairCount);

        pairCount = countCubePairsByDifferentMethod(n);
        System.out.println("Number of pairs (a, b) such that a^3 + b^3 <= " + n + " by different method is: " + pairCount);
    }

    // Alternative Method to count pairs (a, b) such that a^3 + b^3 = n
    // Time Complexity: O(cbrt(n)) where cbrt(n) is the cube root of n
    // Space Complexity: O(1)
    private static int countCubePairsByDifferentMethod(int n) 
    {
        int count = 0;
        
        for (int a = 1; a <= Math.cbrt(n); a++) 
        {
            int aCube = a * a * a;
            
            int diff = n - aCube;
            int cbrtDiff = (int) Math.cbrt(diff);

            if(cbrtDiff * cbrtDiff * cbrtDiff == diff)
            {
                count++;
            }
        }
        return count;
    }

    // Method to count pairs (a, b) such that a^3 + b^3 = n
    // Time Complexity: O(n^2) where cbrt(n) is the cube root of n
    // Space Complexity: O(1)
    private static int countCubePairs(int n) 
    {
        int count = 0;
        
        for (int a = 1; a <= n; a++) 
        {
            for (int b = 0; b <= n; b++) 
            {
                if (a*a*a + b*b*b == n) 
                {
                    count++;
                }
            }
        }
        return count;
    }

}
