package shamrokh.muhammad.leetcode.solution;

import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrencesCounterMap = new HashMap<>();
        Set<Integer> occurencesSet = new HashSet<>();

        // counting each element occurrences
        for(int elem:arr){
            occurrencesCounterMap.put(elem, occurrencesCounterMap.getOrDefault(elem,0)+1);
        }

        // checking if two elements have the same number of occurrences
        for(int occurrence: occurrencesCounterMap.values()){
            if(occurencesSet.contains(occurrence))
                return false;

            occurencesSet.add(occurrence);
        }

        // all the elements appear different amount of occurrences
        return true;

    }
}