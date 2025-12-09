package DSApractice.LogicBuilding.Basic;

import java.util.Scanner;

public class SwapTwoNumbers 
{
    public static void main(String[] args)
    {
        Scanner inputScanner = new Scanner(System.in);
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        inputScanner.close();

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        //Using Third Variable (Time Complexity - O(1) ; Space Complexity - O(1))
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping using third variable: a = " + a + ", b = " + b);

        //Swapping back to original values
        temp = a;
        a = b;
        b = temp;

        //Without Using Third Variable (Time Complexity - O(1) ; Space Complexity - O(1)) - Expected
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping without using third variable: a = " + a + ", b = " + b);
        
    }

}
