package shamrokh.muhammad.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int start = rounds[0];
        int end = rounds[rounds.length-1];
        List<Integer> result = new ArrayList<>();

        // starting sector is equal to ending sector, he is the most visited sector
        if(start == end)
            return List.of(start);

        // starting sector is smaller than ending sector
        if(start < end){
            for(int i=start;i<=end;i++){
                result.add(i);
            }
        } else { // start > end
            for(int i=1;i<=end;i++){
                result.add(i);
            }
            for(int i=start;i<=n;i++){
                result.add(i);
            }
        }

        return result;
    }
}


