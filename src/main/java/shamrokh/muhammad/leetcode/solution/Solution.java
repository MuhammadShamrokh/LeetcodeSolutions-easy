package shamrokh.muhammad.leetcode.solution;


import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        // finding max element in array
        int greatestElementInArray = findGreatestElementInArray(candies);

        // iterating over candies array to build result list
        for(int elem:candies){
            // if element + extra candies is bigger than the greatest element in array we insert true to list
            // otherwise we insert false
            result.add(elem+extraCandies >= greatestElementInArray);
        }

        return result;
    }

    private int findGreatestElementInArray(int[] candies) {
        int max = candies[0];

        for(int elem:candies){
            if(elem>max)
                max = elem;
        }

        return max;
    }
}


