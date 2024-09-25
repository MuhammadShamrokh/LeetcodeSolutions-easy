package shamrokh.muhammad.leetcode.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> arr1ElementsCount = new HashMap<>();
        Set<Integer> arr1ElementsSet = new TreeSet<>();
        Set<Integer> arr2ElementsSet = new TreeSet<>();
        int[] result = new int[arr1.length];
        int index = 0;

        // counting elements appearances in arr1 and storing into hashmap and set
        for(int elem: arr1){
            arr1ElementsCount.put(elem, arr1ElementsCount.getOrDefault(elem,0)+1);
            arr1ElementsSet.add(elem);
        }


        for(int elem:arr2){
            // storing arr2 elements into set
            arr2ElementsSet.add(elem);
            // building result array
            for(int i=0;i<arr1ElementsCount.get(elem);i++){
                result[index] = elem;
                index++;
            }
        }

        // finding all the elements in arr2 and not in arr1
        arr1ElementsSet.removeAll(arr2ElementsSet);

        // filling result with elements that did not appear in arr2
        // using TreeSet, foreach will be scanning elements in sorted order
        for(int elem:arr1ElementsSet){
            for(int i=0;i<arr1ElementsCount.get(elem);i++) {
                result[index] = elem;
                index++;
            }
        }

        return result;
    }
}