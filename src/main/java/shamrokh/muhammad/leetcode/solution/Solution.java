package shamrokh.muhammad.leetcode.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // edge case, empty input array
        if(arr.length == 0)
            return new int[]{};

        Map<Integer, Integer> elementsRanks = new HashMap<>();
        int[] result = new int[arr.length];
        int[] sortedArr = arr.clone();
        int currentRank = 1;

        // sorting array for easier ranks calculation
        Arrays.sort(sortedArr);
        // iterating over element and storing ranks in Ranks map
        for(int elem:sortedArr){
            if(!elementsRanks.containsKey(elem)) {
                elementsRanks.put(elem, currentRank);
                currentRank++;
            }
        }

        // building ranks array
        for(int i=0;i<arr.length;i++){
            result[i] = elementsRanks.get(arr[i]);
        }

        return result;
    }
}