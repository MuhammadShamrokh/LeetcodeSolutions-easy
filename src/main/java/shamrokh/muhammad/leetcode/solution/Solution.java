package shamrokh.muhammad.leetcode.solution;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int determineValidParenthesesCounter = 0;

        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            // opening parentheses of a valid sub parentheses
            if(currentChar == '('){
                if(determineValidParenthesesCounter !=0)
                    sb.append(currentChar);

                determineValidParenthesesCounter++;
            }else{
                if(determineValidParenthesesCounter != 1)
                    sb.append(currentChar);

                determineValidParenthesesCounter--;
            }
        }

        return sb.toString();
    }
}