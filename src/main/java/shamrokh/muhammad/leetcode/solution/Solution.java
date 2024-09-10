package shamrokh.muhammad.leetcode.solution;


import shamrokh.muhammad.leetcode.datastructure.ListNode;
import shamrokh.muhammad.leetcode.datastructure.TreeNode;

import java.util.*;

class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int top = 0, front = 0, side = 0;

        for (int i = 0; i < n; i++) {
            int maxRow = 0;  // Maximum in row (front view)
            int maxCol = 0;  // Maximum in column (side view)

            for (int j = 0; j < n; j++) {
                // Top projection: count all non-zero grid cells
                if (grid[i][j] > 0) {
                    top++;
                }

                // Front projection: max in each row
                maxRow = Math.max(maxRow, grid[i][j]);

                // Side projection: max in each column
                maxCol = Math.max(maxCol, grid[j][i]);
            }

            front += maxRow;  // Add max of the row to the front projection
            side += maxCol;   // Add max of the column to the side projection
        }

        return top + front + side;
    }
}