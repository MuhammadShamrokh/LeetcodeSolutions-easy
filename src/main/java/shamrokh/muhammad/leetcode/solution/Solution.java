package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int countNegatives(int[][] grid) {
        int negativeNumbersCounter = 0;
        int rows = grid.length;
        int columns = grid[0].length;

        // iterating over grid rows
        for (int[] ints : grid) {
            // iterating over grid columns
            for (int j = columns - 1; j >= 0; j--) {
                // if we reach positive number we stop the column scan
                if (ints[j] >= 0)
                    break;

                // we did not reach non-negative numbers, we increase counter
                negativeNumbersCounter++;
            }
        }

        return negativeNumbersCounter;
    }
}

