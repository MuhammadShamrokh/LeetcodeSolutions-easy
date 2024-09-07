package shamrokh.muhammad.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int intervalStart = 0, intervalEnd = 0;
        char currentChar = s.charAt(0);

        for(int i=1;i<s.length();i++){
            // character changed, end of interval
            if(s.charAt(i) != currentChar){
                intervalEnd = i-1;

                if(intervalEnd - intervalStart >= 2) {
                    // checking if this is a new longestInterval
                    result.add(Arrays.asList(intervalStart, intervalEnd));
                }

                // setting parameters for the new interval
                intervalStart = i;
                currentChar = s.charAt(i);
            }
            //if the character did not change, we have nothing to do.
        }

        intervalEnd = s.length() - 1;
        // last interval check
        if(intervalEnd - intervalStart >= 2) {
            // checking if this is a new longestInterval
            result.add(Arrays.asList(intervalStart, intervalEnd));
        }

        return result;
    }
}
