package shamrokh.muhammad.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // hashmap to store all values we have seen
        Map<Integer,Integer> hashmap = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++)
        {
            // target - current value exist in hashmap, we found two sum
            if(hashmap.containsKey(target - nums[i]))
            {
                return new int[]{hashmap.get(target - nums[i]), i};
            }
            else
            {
                hashmap.put(nums[i],i);
            }
        }

        return new int[2];
    }
}
