package shamrokh.muhammad.leetcode.solution;

public class Solution {
    public int maxProduct(int[] nums) {
        int maxValueElement = Integer.MIN_VALUE;
        int secondMaxValueElement = Integer.MIN_VALUE;

        // iterating over nums array to find 2 max elements
        for(int elem:nums){
            if(elem >= maxValueElement){
                secondMaxValueElement = maxValueElement;
                maxValueElement = elem;
            } else if(elem > secondMaxValueElement){
                secondMaxValueElement = elem;
            }
        }

        // returning max product (max element - 1)*(second max element - 1)
        return (maxValueElement-1)*(secondMaxValueElement-1);
    }
}
