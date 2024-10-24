package shamrokh.muhammad.leetcode.solution;


class Solution {
    public int minStartValue(int[] nums) {
        int minValueDuringIteration = Integer.MAX_VALUE;
        int currentValue = 0;

        // iterating over nums to check lowest value we can get/
        for(int num:nums){
            currentValue+=num;

            minValueDuringIteration = Math.min(currentValue, minValueDuringIteration);
        }

        // if lowest value is greater than 1 we return 1 as a lowest start value
        // else, we return |minValueDuringIteration|+1
        return minValueDuringIteration>=1? 1: (-1*minValueDuringIteration + 1);
    }
}


