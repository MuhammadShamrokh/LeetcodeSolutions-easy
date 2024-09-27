package shamrokh.muhammad.leetcode.solution;



class Solution{
    // Days in each month for a non-leap year
    private static final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int daysBetweenDates(String date1, String date2) {
        // Step 1: Parse the two dates
        int[] d1 = parseDate(date1);
        int[] d2 = parseDate(date2);

        // Step 2: Convert both dates to the number of days from year 0
        int days1 = daysFromStart(d1[0], d1[1], d1[2]);
        int days2 = daysFromStart(d2[0], d2[1], d2[2]);

        // Step 3: Return the absolute difference between the two day counts
        return Math.abs(days1 - days2);
    }

    // Check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Calculate the number of days from year 0 to the given date (YYYY-MM-DD)
    private int daysFromStart(int year, int month, int day) {
        // Count the number of days up to the given year
        int days = 0;

        // Add the days for all complete years before the current year
        for (int i = 0; i < year; i++) {
            days += isLeapYear(i) ? 366 : 365;
        }

        // Add the days for all complete months in the current year
        for (int i = 0; i < month - 1; i++) {
            days += daysInMonth[i];
            if (i == 1 && isLeapYear(year)) { // February of a leap year
                days += 1;
            }
        }

        // Add the days in the current month
        days += day;

        return days;
    }

    // Parse the date string in the format "YYYY-MM-DD" into year, month, and day
    private int[] parseDate(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return new int[]{year, month, day};
    }
}