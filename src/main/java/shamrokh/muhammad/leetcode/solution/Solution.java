package shamrokh.muhammad.leetcode.solution;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> fromCitySet = new HashSet<>();
        Set<String> toCitySet = new HashSet<>();

        // iterating over all paths to fill sets
        for(List<String> direction:paths){
            fromCitySet.add(direction.get(0));
            toCitySet.add(direction.get((1)));
        }

        //subtracting the two sets to find the destCity
        toCitySet.removeAll(fromCitySet);

        // it is guarantee that the set will have exactly one element.
        return toCitySet.stream().findFirst().get();
    }
}
