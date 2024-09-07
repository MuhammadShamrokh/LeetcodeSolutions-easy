package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.ListNode;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        //edge case: string of size 0 or 1
        if(s.isEmpty() || s.length() == 1)
            return s.length();

        //implementing sliding window to scan the string
        int leftIndex = 0;
        int rightIndex = 0;
        int longestSubstringLength = 0;
        Map<Character, Integer> lastSeenIndexMap = new HashMap<>();

        while(rightIndex < s.length()){
            //  next character in sliding window exists in lastSeenIndexMap
            if(lastSeenIndexMap.containsKey(s.charAt(rightIndex))){
                // we update leftIndex if its value is smaller than the last seen current character index
                if(leftIndex < lastSeenIndexMap.get(s.charAt(rightIndex)) +1)
                    leftIndex = lastSeenIndexMap.get(s.charAt(rightIndex)) +1;
            }

            // update hashmap and sliding window
            lastSeenIndexMap.put(s.charAt(rightIndex), rightIndex);
            rightIndex++;
            longestSubstringLength = Math.max(longestSubstringLength, rightIndex-leftIndex);
        }

        return longestSubstringLength;
    }
}

