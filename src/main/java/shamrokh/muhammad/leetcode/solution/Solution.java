package shamrokh.muhammad.leetcode.solution;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public void duplicateZeros(int[] arr) {
        int arrayLength = arr.length;
        int[] result = new int[arrayLength];
        int reader = 0;
        int writer = 0;

        while(writer < arrayLength){
            result[writer] = arr[reader];

            if(arr[reader] == 0){
                writer++;
                if(writer < arrayLength)
                    result[writer] = 0;
            }

            reader++;
            writer++;
        }

        for(int i=0;i<arrayLength;i++){
            arr[i] = result[i];
        }
    }
}