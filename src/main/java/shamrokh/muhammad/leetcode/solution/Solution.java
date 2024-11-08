package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int currentIndex = 0;

        for(int i=0;i<n;i++){
            result[currentIndex++] = nums[i];
            result[currentIndex++] = nums[n+i];
        }

        return result;
    }
}