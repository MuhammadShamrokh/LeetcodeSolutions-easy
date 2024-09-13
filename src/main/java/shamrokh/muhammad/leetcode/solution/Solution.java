package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.ListNode;
import shamrokh.muhammad.leetcode.datastructure.TreeNode;
import java.util.*;

public class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int nameIndexScanner = 0;
        int typedIndexScanner = 0;

        //edge case, string starts with different characters
        if (name.charAt(0) != typed.charAt(0))
            return false;

        while (nameIndexScanner < name.length() && typedIndexScanner < typed.length()) {
            // the current character in name and typed string are equal, we increase both indexes;
            if (name.charAt(nameIndexScanner) == typed.charAt(typedIndexScanner)) {
                nameIndexScanner++;
                typedIndexScanner++;
            }
            // current chars are diff, we check if it is a repeated char
            else {
                if (typed.charAt(typedIndexScanner) != typed.charAt(typedIndexScanner - 1))
                    return false;

                //skipping all the long pressed characters
                while (typedIndexScanner < typed.length() && typed.charAt(typedIndexScanner) == typed.charAt(typedIndexScanner - 1))
                    typedIndexScanner++;
            }
        }

        // we did not scan all name characters
        if(nameIndexScanner < name.length())
            return false;

        // checking if typed string scan is over
        while (typedIndexScanner < typed.length()) {
            if (typed.charAt(typedIndexScanner) != name.charAt(nameIndexScanner - 1))
                return false;

            typedIndexScanner++;
        }

        return true;
    }
}