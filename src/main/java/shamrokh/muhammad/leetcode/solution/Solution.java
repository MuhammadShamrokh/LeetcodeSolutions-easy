package shamrokh.muhammad.leetcode.solution;

import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> numbersOneSet = convertArrayToSet(nums1);
        Set<Integer> numbersTwoSet = convertArrayToSet(nums2);
        List<List<Integer>> result = new ArrayList<>(2);

        // scanning all distinct elements in nums1 (Set)
        // to find all elements that does not appear in nums2
        List<Integer> listOfElementsOne = new ArrayList<>();
        for(Integer elem:numbersOneSet){
            if(!numbersTwoSet.contains(elem)){
                listOfElementsOne.add(elem);
            }
        }

        // scanning all distinct elements in nums2 (Set)
        // to find all elements that does not appear in nums1
        List<Integer> listOfElementsTwo = new ArrayList<>();
        for(Integer elem:numbersTwoSet){
            if(!numbersOneSet.contains(elem)){
                listOfElementsTwo.add(elem);
            }
        }

        // adding results lists into final 2D list
        result.add(listOfElementsOne);
        result.add(listOfElementsTwo);

        return result;
    }

    private Set<Integer> convertArrayToSet(int[] arr){
        Set<Integer> resultSet = new HashSet<>();

        for(int elem:arr){
            resultSet.add(elem);
        }

        return resultSet;
    }
}