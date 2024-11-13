package shamrokh.muhammad.leetcode.solution;


import java.util.Arrays;

public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length == 2)
            return true;

        Arrays.sort(arr);

        int difference = arr[1] - arr[0];

        for(int i=1;i<arr.length - 1;i++){
            // checking arithmetic progression condition
            if(arr[i+1] - arr[i] != difference)
                return false;
        }

        // arr can be rearranged to form an arithmetic progression
        return true;
    }
}