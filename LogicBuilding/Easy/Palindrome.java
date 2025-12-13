package DSApractice.LogicBuilding.Easy;

public class Palindrome 
{
    // Method to check if a string is a palindrome
    // Time Complexity: O(n) where n is the length of the string
    // Space Complexity: O(1)
    public static boolean isPalindrome(String str) 
    {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right)) 
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) 
    {
        String testStr1 = "racecar";
        String testStr2 = "hello";

        System.out.println(testStr1 + " is palindrome: " + isPalindrome(testStr1));
        System.out.println(testStr2 + " is palindrome: " + isPalindrome(testStr2));
    }

}
