package shamrokh.muhammad.leetcode.solution;

import java.util.*;

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;

        // iterating over all points
        for (int i = 1; i < points.length; i++) {
            // calculating the distance in x-axis
            int horizontal = Math.abs(points[i][0] - points[i - 1][0]);
            // calculating the distance in y-axis
            int vertical = Math.abs(points[i][1] - points[i - 1][1]);
            // the amount of steps is equal to the max between them both
            sum += Math.max(horizontal, vertical);
        }

        return sum;
    }
}