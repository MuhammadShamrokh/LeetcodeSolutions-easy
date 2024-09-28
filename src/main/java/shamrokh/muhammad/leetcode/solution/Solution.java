package shamrokh.muhammad.leetcode.solution;

public class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        // If the month is January or February, adjust to treat them as the 13th or 14th month of the previous year
        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
        }

        int q = day; // Day of the month
        int m = month; // Adjusted month (March = 3, February = 14 of previous year)
        int K = year % 100; // Year of the century (last two digits of the year)
        int J = year / 100; // Century (first two digits of the year)

        // Zeller's Congruence formula
        int h = (q + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) - 2 * J) % 7;

        // Convert Zeller's output to actual days (0 = Saturday, 1 = Sunday, ..., 6 = Friday)
        String[] daysOfWeek = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

        // Zeller's congruence can sometimes return negative numbers, so we adjust the result to always be positive
        if (h < 0) {
            h += 7;
        }

        // Return the day of the week corresponding to the result from Zeller's formula
        return daysOfWeek[h];
    }

}