package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.ListNode;
import shamrokh.muhammad.leetcode.datastructure.TreeNode;
import java.util.*;

class Solution {
    public String reverseOnlyLetters(String s) {
        // we convert s into a char[] since String is immutable
        char[] reversedString= s.toCharArray();

        int startIndex = 0;
        int endIndex = s.length() - 1;

        while(startIndex < endIndex){
            // we skip startIndex since it is not pointing to english letter
            if(!Character.isAlphabetic(reversedString[startIndex])) {
                startIndex++;
            }
            // we skip endIndex since it is not pointing to english letter
            if((!Character.isAlphabetic(reversedString[endIndex])))
                endIndex--;
            // both startIndex and endIndex are pointing to english letter, we swap them.
            if(Character.isAlphabetic(reversedString[startIndex])
                    && Character.isAlphabetic(reversedString[endIndex])){
                char tmp = reversedString[startIndex];
                reversedString[startIndex] = reversedString[endIndex];
                reversedString[endIndex] = tmp;

                startIndex++;
                endIndex--;
            }
        }

        // convert char[] into String
        return new String(reversedString);
    }
}