package DSApractice.LogicBuilding.FrequentlyAsked;

public class Palindrome 
{
    public static void main(String[] args) 
    {
        String str = "madam";
        if(isPalindrome(str))
        {
            System.out.println(str + " is a Palindrome");
        }
        else
        {
            System.out.println(str + " is not a Palindrome");
        }
    }

    // Approach using character array
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static boolean isPalindrome(String str) 
    {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while(left < right)
        {
            if(charArray[left] != charArray[right])
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Another Approach using StringBuilder
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // return str.equals(new StringBuilder(str).reverse().toString());
}
