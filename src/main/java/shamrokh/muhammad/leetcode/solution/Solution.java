package shamrokh.muhammad.leetcode.solution;

import java.util.*;

class Solution {
    public String removeDuplicates(String s) {
        // Step 1: Create a stack to store the characters
        Stack<Character> stack = new Stack<>();

        // Step 2: Traverse the string character by character
        for (char c : s.toCharArray()) {
            // If the stack is not empty and the top element is equal to the current character
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // Remove the top element (i.e., remove the duplicate)
            } else {
                stack.push(c); // Otherwise, push the current character to the stack
            }
        }

        // Step 3: Build the result string from the stack
        StringBuilder result = new StringBuilder();
        // foreach loop scans the stack from bottom to top! (not LIFO)
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}
