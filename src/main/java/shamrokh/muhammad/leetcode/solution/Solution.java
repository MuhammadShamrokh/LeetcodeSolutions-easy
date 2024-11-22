package shamrokh.muhammad.leetcode.solution;

public class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();

        // iterating over string to detect adjacent characters that make string bad
        for(int i=0;i<s.length();i++){
            // empty stack, we just insert the current character
            if(sb.isEmpty()){
                sb.append(s.charAt(i));
            } else { // stack is not empty
                // bad adjacent characters, we remove them
                // remove first character and ignore second one
                if (Character.isLowerCase(s.charAt(i)) != Character.isLowerCase(sb.charAt(sb.length()-1)) &&
                    Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(sb.charAt(sb.length()-1))){
                    sb.setLength(sb.length()-1);
                } else {
                    sb.append(s.charAt(i));
                }
            }
        }

        return sb.toString();
    }
}


