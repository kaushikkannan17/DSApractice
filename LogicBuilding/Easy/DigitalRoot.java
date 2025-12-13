package DSApractice.LogicBuilding.Easy;

public class DigitalRoot 
{
    // Method to calculate the digital root of a number
    // Time Complexity: O(d) where d = number of digits = Θ(log10 n)
    // Space Complexity: O(1)
    public static int digitalRoot(int number) 
    {
        while (number >= 10) 
        {
            int sum = 0;
            while (number != 0) 
            {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return number;
    }

    // Alternative method using formula
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static int digitalRootFormula(int number) 
    {
        return (number != 0) ? number % 9 : 0;
    }

    public static void main(String[] args) 
    {
        int number = 1234; // Example number
        int result = digitalRoot(number);
        System.out.println("Digital root of " + number + " is: " + result);

        result = digitalRootFormula(number);
        System.out.println("Digital root of " + number + " using formula is: " + result);
    }

}
