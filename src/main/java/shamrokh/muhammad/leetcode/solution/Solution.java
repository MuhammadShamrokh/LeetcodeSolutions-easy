package shamrokh.muhammad.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int minAbsDifferent = Integer.MAX_VALUE;

        // sorting arr (the different will be minimum between adjacency elements)
        Arrays.sort(arr);

        // iterating over array elements to build result dual array
        for(int i=0;i<arr.length-1;i++){
            int difference = arr[i+1] - arr[i];

            if(difference < minAbsDifferent){
                result.clear();
                result.add(Arrays.asList(arr[i], arr[i+1]));
                minAbsDifferent = difference;
            } else if(difference == minAbsDifferent){
                result.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }

        return result;
    }
}