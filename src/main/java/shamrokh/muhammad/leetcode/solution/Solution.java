package shamrokh.muhammad.leetcode.solution;

public class Solution {
    public int dayOfYear(String date) {
        // Step 1: Extract year, month, and day from the input string
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        // Step 2: Define the number of days in each month for a non-leap year
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Step 3: Check if the year is a leap year
        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // Update February days for leap year
        }

        // Step 4: Calculate the total number of days
        int dayOfYear = 0;
        // Add days of the months preceding the current month
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        // Add the current day
        dayOfYear += day;

        return dayOfYear;
    }

    // Helper function to check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}