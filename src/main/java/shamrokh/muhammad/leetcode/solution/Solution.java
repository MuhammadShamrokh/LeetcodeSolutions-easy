package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.ListNode;
import shamrokh.muhammad.leetcode.datastructure.TreeNode;
import java.util.*;

public class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int nextEvenIndex = 0;
        int nextOddIndex = 1;
        int numsScanner = 0;

        while(numsScanner < nums.length){
            // good situation, no need to do swapping
            if((numsScanner % 2 == 0 && nums[numsScanner]% 2 == 0)
                    || (numsScanner % 2 == 1 && nums[numsScanner]%2 == 1 )){
                // updating next available odd/even index
                if(numsScanner == nextEvenIndex)
                    nextEvenIndex += 2;
                else if(numsScanner == nextOddIndex)
                    nextOddIndex +=2;

                // updating scanning index
                numsScanner++;
            }
            // currently at even idx which has odd number
            else if(numsScanner % 2 == 0){
                swap(nums, numsScanner, nextOddIndex);
                nextOddIndex += 2;
            }
            else if(numsScanner % 2 == 1){
                swap(nums, numsScanner, nextEvenIndex);
                nextEvenIndex += 2;
            }
        }

        return nums;
    }

    private void swap(int[] nums, int idx1, int idx2){
        int tmp=nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = tmp;
    }
}