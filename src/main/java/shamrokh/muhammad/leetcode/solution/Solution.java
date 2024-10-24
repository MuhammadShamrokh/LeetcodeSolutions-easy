package shamrokh.muhammad.leetcode.solution;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int currentListElementsSum = 0;
        int numsElementsSum = sumArrElements(nums);

        Arrays.sort(nums);

        // scanning the array from bigger elements to smaller elements
        for(int i= nums.length-1;i>=0;i--){
            // adding nums[i] to subsequence
            result.add(nums[i]);
            currentListElementsSum+=nums[i];
            numsElementsSum-=nums[i];

            if(currentListElementsSum > numsElementsSum){
                break;
            }
        }

        return result;
    }

    private int sumArrElements(int[] nums) {
        int result = 0;

        for(int num:nums){
            result+=num;
        }

        return result;
    }
}


