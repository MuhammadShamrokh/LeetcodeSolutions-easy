package shamrokh.muhammad.leetcode.solution;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String makeFancyString(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int consecutiveCharactersCount = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);

            if(!stack.isEmpty()){
                if(stack.peek() == currentChar) {
                    consecutiveCharactersCount++;


                    if (consecutiveCharactersCount <= 2)
                        stack.push(currentChar);
                }
                else {
                    stack.push(currentChar);
                    consecutiveCharactersCount = 1;
                }
            }
            else {
                stack.push(currentChar);
                consecutiveCharactersCount = 1;
            }
        }

        // scanning stack characters from bottom to top
        for(char c:stack){
            sb.append(c);
        }

        return sb.reverse().toString();
    }
}