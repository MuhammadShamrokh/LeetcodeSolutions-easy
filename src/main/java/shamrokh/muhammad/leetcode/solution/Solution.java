package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.ListNode;
import shamrokh.muhammad.leetcode.datastructure.TreeNode;
import java.util.*;

class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums[0] > nums[nums.length-1])
            return checkIfMonotonicDecreasingArray(nums);
        else if(nums[0] < nums[nums.length-1])
            return checkIfMonotonicIncreasingArray(nums);
        else // all elements are equal
            return true;
    }

    private boolean checkIfMonotonicIncreasingArray(int[] nums) {
        for(int i=0;i<nums.length - 1;i++){
            if(nums[i] > nums[i+1])
                return false;
        }

        return true;
    }

    private boolean checkIfMonotonicDecreasingArray(int[] nums) {
        for(int i=0;i<nums.length - 1;i++){
            if(nums[i] < nums[i+1])
                return false;
        }

        return true;
    }
}