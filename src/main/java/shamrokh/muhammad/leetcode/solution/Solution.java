package shamrokh.muhammad.leetcode.solution;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int remainder = 0; // To track the remainder of the number mod 5

        // Iterate through each bit in the binary array
        for (int num : nums) {
            // Update the number (remainder) by shifting it left and adding the current bit
            remainder = (remainder * 2 + num) % 5;

            // If the remainder is 0, the number is divisible by 5
            result.add(remainder == 0);
        }

        return result;
    }
}