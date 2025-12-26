package DSApractice.LogicBuilding.FrequentlyAsked;

public class ReverseAString 
{
    public static void main(String[] args) 
    {
        String str = "Hello World";
        String reversedStr = reverseString(str);
        System.out.println("Reversed String: " + reversedStr);
    }

    // Approach using character array
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    private static String reverseString(String str) 
    {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while(left < right)
        {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);
    }

    // Another Approach using StringBuilder
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // return new StringBuilder(str).reverse().toString();
}
