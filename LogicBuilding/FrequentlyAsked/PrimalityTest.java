package DSApractice.LogicBuilding.FrequentlyAsked;

public class PrimalityTest 
{
    public static void main(String[] args) 
    {
        int number = 29;
        boolean isPrime = checkPrimality(number);
        if(isPrime)
        {
            System.out.println(number + " is a Prime Number");
        }
        else
        {
            System.out.println(number + " is not a Prime Number");
        }
    }

    // Approach using trial division
    // Time Complexity: O(sqrt(n))
    // Space Complexity: O(1)
    private static boolean checkPrimality(int num) 
    {
        if(num <= 1)
        {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    // Another Approach using 6k +/- 1 optimization
    // Time Complexity: O(sqrt(n)/3)
    // Space Complexity: O(1)
    // if(num <= 1) return false;
    // if(num <= 3) return true;
    // if(num % 2 == 0 || num % 3 == 0) return false;
    // for(int i = 5; i * i <= num; i += 6)
    // {
    //     if(num % i == 0 || num % (i + 2) == 0)
    //     {
    //         return false;
    //     }
    // }
    // return true;
    
}