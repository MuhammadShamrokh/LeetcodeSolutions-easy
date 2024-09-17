package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.TreeNode;

import java.util.Arrays;


class Solution {
    public int largestPerimeter(int[] nums) {
        // sorting array for efficient angles search
        Arrays.sort(nums);

        // iterating over every three values to check if they are valid triangle angles
        // scanning from high to low values to find the highest triangle perimeter
        for(int i=nums.length - 3; i>=0;i--){
            if(nums[i] + nums[i+1] > nums[i+2])
                return nums[i] + nums[i+1] + nums[i+2];
        }

        return 0;
    }
}