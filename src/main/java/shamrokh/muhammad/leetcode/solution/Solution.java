package shamrokh.muhammad.leetcode.solution;


public class Solution{
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        int scanner = 0;
        // calculating result array size
        for(int i=0;i< nums.length;i+=2){
            size+=nums[i];
        }

        int[] result = new int[size];

        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++) {
                result[scanner] = nums[i + 1];
                scanner++;
            }
        }

        return result;
    }
}