package shamrokh.muhammad.leetcode.solution;


class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] numbersCounter = new int[101];
        int[] totalSumTillNum = new int[101];
        int[] result = new int[nums.length];

        // counting each number appearances
        for(int num:nums){
            numbersCounter[num]++;
        }

        // building total sum array (
        totalSumTillNum[0] = 0;
        for(int i=1;i<=100;i++){
            totalSumTillNum[i] = totalSumTillNum[i-1] + numbersCounter[i-1];
        }

        // iterating over nums to build result array using totalSumTillNum array
        for(int i=0;i<nums.length;i++){
            result[i] = totalSumTillNum[nums[i]];
        }

        return result;
    }
}

