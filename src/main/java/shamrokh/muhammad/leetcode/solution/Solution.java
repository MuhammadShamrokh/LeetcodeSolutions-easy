package shamrokh.muhammad.leetcode.solution;

import java.util.*;

class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        int resultCount = 0;

        // sorting array to get the "expected array"
        Arrays.sort(expected);
        // iterating over arrays to calculate different indexes elements
        for(int i=0;i<heights.length;i++){
            if(expected[i] != heights[i])
                resultCount++;
        }

        return resultCount;
    }
}
