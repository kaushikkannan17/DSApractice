package DSApractice.LogicBuilding.Easy;

import java.util.Scanner;

/**
 * Calculate day of the week using Zeller's Congruence (Gregorian calendar).
 *
 * Variables (code -> math notation):
 *  - `day` = q : day of month
 *  - `month` = m : months 3..14 (March=3, ..., January=13, February=14)
 *    (January and February are treated as months 13 and 14 of the previous year)
 *  - `k` = year % 100 : year within the century (K)
 *  - `j` = year / 100 : zero-based century (J)
 *
 * Formula (integer arithmetic):
 *   f = q + floor(13*(m+1)/5) + K + floor(K/4) + floor(J/4) + 5*J
 *   dayOfWeek = f % 7  // 0=Saturday, 1=Sunday, ..., 6=Friday
 *
 * Note: Java's integer division behaves like floor here for the positive inputs used,
 * and the `days` array maps the remainder to the weekday name.
 */

public class DayOfWeekForGivenDate 
{
    // Method to calculate day of the week for a given date
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static String getDayOfWeek(int day, int month, int year) 
    {
        if (month < 3) 
        {
            month += 12;
            year--;
        }

        // Zeller's Congruence formula variables
        int k = year % 100;
        int j = year / 100;

        // Calculate day of the week using Zeller's Congruence formula
        int f = day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j);
        int dayOfWeek = f % 7;

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return days[dayOfWeek];
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.close();

        String dayOfWeek = getDayOfWeek(day, month, year);
        System.out.println("The day of the week for " + day + "/" + month + "/" + year + " is: " + dayOfWeek);
    }

}
