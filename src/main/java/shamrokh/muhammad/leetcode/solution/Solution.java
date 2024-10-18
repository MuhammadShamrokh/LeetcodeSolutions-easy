package shamrokh.muhammad.leetcode.solution;

import java.util.HashMap;
import java.util.Map;


class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> valueToIndexMap = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            // checking if we saw arr[i]*2 or arr[i]/2 at earlier iteration
            if(valueToIndexMap.containsKey(2*arr[i])  ||
                    ((double)arr[i]/2 % 1 == 0 &&valueToIndexMap.containsKey(arr[i]/2))){

                return true;
            }

            valueToIndexMap.put(arr[i], i);
        }

        return false;
    }
}

