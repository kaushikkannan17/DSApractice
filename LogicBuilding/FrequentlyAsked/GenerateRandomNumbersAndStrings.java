package DSApractice.LogicBuilding.FrequentlyAsked;

public class GenerateRandomNumbersAndStrings 
{
    public static void main(String[] args) 
    {
        // Generating Random Numbers
        int randomNum = (int)(Math.random() * 100); // Random number between 0 and 99
        System.out.println("Random Number: " + randomNum);

        // Generating Random Strings
        String randomStr = generateRandomString(10); // Random string of length 10
        System.out.println("Random String: " + randomStr);
    }

    // Method to generate a random string of given length
    private static String generateRandomString(int length) 
    {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++) 
        {
            int index = (int)(Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

}
