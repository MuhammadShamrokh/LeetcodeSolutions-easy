package shamrokh.muhammad.leetcode.solution;


import java.util.*;

class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> result = new HashSet<>();
        int length = words.length;

        // scanning every string couples
        for(int i=0;i<length;i++) {
            for(int j=i+1;j<length;j++) {
                //checking if words[j] is substring of words[i]
                if(words[i].contains(words[j])){
                    result.add(words[j]);
                }
                else if(words[j].contains(words[i])) {
                    result.add(words[i]);
                }

            }
        }

        return new ArrayList<>(result);
    }
}


