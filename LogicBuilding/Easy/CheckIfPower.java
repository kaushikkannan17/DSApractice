package DSApractice.LogicBuilding.Easy;

import java.util.Scanner;

public class CheckIfPower 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (isPowerOfAnotherNumber(number)) 
        {
            System.out.println(number + " can be expressed as a^b where a > 0 and b > 1.");
        } 
        else 
        {
            System.out.println(number + " cannot be expressed as a^b where a > 0 and b > 1.");
        }

        if(isPowerOfAnotherNumberLogarithmic(number))
        {
            System.out.println(number + " can be expressed as a^b where a > 0 and b > 1.");
        } 
        else 
        {
            System.out.println(number + " cannot be expressed as a^b where a > 0 and b > 1.");
        }

        if(isPowerOf3(number))
        {
            System.out.println(number + " can be expressed as a^3 where a > 0.");
        } 
        else 
        {
            System.out.println(number + " cannot be expressed as a^3 where a > 0.");
        }
    }
    
    // Method to check if a number is a power of 3 using logarithms
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    private static boolean isPowerOf3(int number) 
    {
        double power = Math.log10(number) / Math.log10(3);
        if(power - (int)power == 0)
        {
            return true;
        }
        return false;
    }

    // Optimized method to check if a number can be expressed as a^b using logarithms
    // Time Complexity: O(√n) where n is the input value (loop over bases up to sqrt(n))
    // Space Complexity: O(1)
    private static boolean isPowerOfAnotherNumberLogarithmic(int number) 
    {
        if (number <= 1) 
        {
            return false; // 0 and 1 cannot be expressed as a^b with b > 1
        }
        for (int base = 2; base * base <= number; base++) 
        {
            double exponent = Math.log(number) / Math.log(base);
            if (Math.abs(exponent - Math.round(exponent)) < 1e-10 && exponent > 1) 
            {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number can be expressed as a^b
    // Time Complexity: O(√n * log n)
    // Space Complexity: O(1)
    private static boolean isPowerOfAnotherNumber(int number) 
    {
        if (number <= 1) 
        {
            return false; // 0 and 1 cannot be expressed as a^b with b > 1
        }
        for (int base = 2; base * base <= number; base++) 
        {
            int power = base * base;
            while (power <= number) 
            {
                if (power == number) 
                {
                    return true;
                }
                power *= base;
            }
        }
        return false;
    }

}
