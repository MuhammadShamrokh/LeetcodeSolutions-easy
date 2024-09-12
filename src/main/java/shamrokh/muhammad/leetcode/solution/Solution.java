package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.ListNode;
import shamrokh.muhammad.leetcode.datastructure.TreeNode;
import java.util.*;

class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0];
        // highest number in array is 10000 as given in the question
        int min = 10000;


        for(int i = 0; i < nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }

            if(nums[i] < min){
                min = nums[i];
            }
        }

        // we add the k to the minimum number and subtract k to the maximum number
        // to receive the minimum possible result
        min += k;
        max -= k;

        // if the result is lower than 0, that mean we subtract less than k from the max value inorder to get lower value (which is zero)
        return Math.max(0, max - min);
    }
}