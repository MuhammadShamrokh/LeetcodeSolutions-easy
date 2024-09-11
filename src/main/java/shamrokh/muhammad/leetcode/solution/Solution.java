package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.ListNode;
import shamrokh.muhammad.leetcode.datastructure.TreeNode;
import java.util.*;

class Solution {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int surfaceArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int v = grid[i][j];

                // If there are cubes in this cell
                if (v > 0) {
                    // Add surface area of this stack without considering adjacency
                    surfaceArea += 6 * v;

                    // Subtract internal surfaces for stacked cubes in the same column
                    surfaceArea -= 2 * (v - 1);

                    // Check adjacent cubes in row (left neighbor)
                    if (i > 0) {
                        surfaceArea -= 2 * Math.min(grid[i][j], grid[i - 1][j]);
                    }

                    // Check adjacent cubes in column (top neighbor)
                    if (j > 0) {
                        surfaceArea -= 2 * Math.min(grid[i][j], grid[i][j - 1]);
                    }
                }
            }
        }

        return surfaceArea;
    }
}