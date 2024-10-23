package shamrokh.muhammad.leetcode.solution;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> result = new LinkedList<>();
        int[] resultArray = new int[nums.length];
        int copyCounter = 0;

        for(int i=0;i< nums.length;i++){
            if(result.size() <= index[i]){
                result.add(nums[i]);
            }
            else{
                result.add(index[i], nums[i]);
            }
        }

        for(int num:result){
            resultArray[copyCounter] = num;
            copyCounter++;
        }

        return resultArray;
    }
}


