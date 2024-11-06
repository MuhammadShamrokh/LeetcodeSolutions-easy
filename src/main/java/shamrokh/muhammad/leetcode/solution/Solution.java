package shamrokh.muhammad.leetcode.solution;

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int currentGap = 0;
        int firstOneAppearanceIndex = 0;

        // finding first '1' appearance
        while(firstOneAppearanceIndex < nums.length && nums[firstOneAppearanceIndex] != 1){
            firstOneAppearanceIndex++;
        }

        // nums has no '1' appearances
        if(firstOneAppearanceIndex == nums.length)
            return true;


        // iterating over the rest of nums to check if gaps between 1 are bigger or equal to k
        for(int i=firstOneAppearanceIndex+1;i<nums.length;i++){
            if(nums[i] == 1){
                if(currentGap < k)
                    // smaller gap was found
                    return false;
                else
                    currentGap = 0;

            } else if(nums[i] == 0){
                currentGap++;
            }
        }

        // all gaps are bigger or equal to k
        return true;
    }
}
