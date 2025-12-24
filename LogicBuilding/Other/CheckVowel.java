package DSApractice.LogicBuilding.Other;

public class CheckVowel 
{
    public static void main(String[] args) 
    {
        char ch = 'E';
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || 
           ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println(ch + " is a Vowel");
        }
        else
        {
            System.out.println(ch + " is not a Vowel");
        }

        // Another Approach using switch-case
        switch(ch)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel (using switch-case)");
                break;
            default:
                System.out.println(ch + " is not a Vowel (using switch-case)");
        }

        // Another Approach using String method
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        String vowels = "AEIOUaeiou";
        if(vowels.indexOf(ch) != -1)
        {
            System.out.println(ch + " is a Vowel (using String method)");
        }
        else
        {
            System.out.println(ch + " is not a Vowel (using String method)");
        }

        // Another Approach using Character method
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        if(Character.toString(ch).matches("[AEIOUaeiou]"))
        {
            System.out.println(ch + " is a Vowel (using Character method)");
        }
        else
        {
            System.out.println(ch + " is not a Vowel (using Character method)");
        }

        // Another Approach using ASCII values
        int ascii = (int) ch;
        if(ascii == 65 || ascii == 69 || ascii == 73 || ascii == 79 || ascii == 85 ||
           ascii == 97 || ascii == 101 || ascii == 105 || ascii == 111 || ascii == 117)
        {
            System.out.println(ch + " is a Vowel (using ASCII values)");
        }
        else
        {
            System.out.println(ch + " is not a Vowel (using ASCII values)");
        }

        //equalIfIgnoreCase Approach
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        if("AEIOU".indexOf(Character.toUpperCase(ch)) != -1)
        {
            System.out.println(ch + " is a Vowel (using equalIfIgnoreCase)");
        }
        else
        {
            System.out.println(ch + " is not a Vowel (using equalIfIgnoreCase)");
        }

    }
    

}
