package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.ListNode;
import shamrokh.muhammad.leetcode.datastructure.TreeNode;
import java.util.*;

class Solution {
    public boolean validMountainArray(int[] arr) {
        // if length < 3 then cant be a mountain array
        if(arr.length < 3)
            return false;

        //edge case: check if array start with increasing values
        if(arr[0] >= arr[1])
            return false;

        int index = 1;

        // iterating over increasing values area
        while(index < arr.length && arr[index] >= arr[index-1]){
            // mountain array cant have equal values
            if(arr[index] == arr[index-1])
                return false;

            index++;
        }

        // checking if array has decreasing values area
        if(index == arr.length)
            return false;

        // iterating over decreasing values area
        while(index < arr.length && arr[index] <= arr[index-1]){
            // mountain array cant have equal values
            if(arr[index] == arr[index-1])
                return false;

            index ++;
        }


        return index == arr.length;
    }

}