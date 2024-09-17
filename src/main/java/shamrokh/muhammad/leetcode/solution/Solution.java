package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.TreeNode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int lowScanner =0;
        int highScanner = nums.length -1;
        int[] result = new int[nums.length];
        int index = 0;

        while(highScanner >= lowScanner){
            int lowScannerSquare = (int)Math.pow(nums[lowScanner],2);
            int highScannerSquare = (int)Math.pow(nums[highScanner], 2);

            if(lowScannerSquare < highScannerSquare){
                result[index] = highScannerSquare;
                highScanner--;
            }
            else{
                result[index] = lowScannerSquare;
                lowScanner++;
            }

            index++;
        }

        return reverseArray(result);
    }

    private int[] reverseArray(int[] arr){
        int length = arr.length;
        int[] reversedArray = new int[length];

        for(int i=length-1;i>=0;i--){
            reversedArray[length - 1 - i] = arr[i];
        }

        return reversedArray;
    }
}
