package shamrokh.muhammad.leetcode.solution;

import java.util.*;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int scanner = 0;

        // converting negative numbers (if exists) into positive
        while(scanner < nums.length && nums[scanner] <0 && k > 0){
            nums[scanner] *= -1;
            scanner++;
            k--;
        }

        // if k is odd, we multiply the smallest number by -1 (scanner has the index of the smallest number)
        if(k%2 == 1) {
            int index = findLowestValueIndex(nums);
            nums[index] *= -1;
        }

        return Arrays.stream(nums).sum();
    }

    private int findLowestValueIndex(int[] nums) {
        int min = nums[0];
        int index = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                index = i;
                min = nums[i];
            }
        }

        return index;
    }
}