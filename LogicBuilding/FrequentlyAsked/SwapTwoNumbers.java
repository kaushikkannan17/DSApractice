package DSApractice.LogicBuilding.FrequentlyAsked;

public class SwapTwoNumbers 
{
    public static void main(String[] args) 
    {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swapping without using a temporary variable
        a = a + b; // a now becomes 15
        b = a - b; // b becomes 5
        a = a - b; // a becomes 10

        System.out.println("After swapping: a = " + a + ", b = " + b);

        b = a+b - (a=b); // Swapping using single line expression

        System.out.println("After swapping again: a = " + a + ", b = " + b);

        a = a ^ b; // a now becomes 15 (1111 in binary)
        b = a ^ b; // b becomes 5 (0101 in binary)
        a = a ^ b; // a becomes 10 (1010 in binary)
        System.out.println("After swapping using XOR: a = " + a + ", b = " + b);
    }

}
