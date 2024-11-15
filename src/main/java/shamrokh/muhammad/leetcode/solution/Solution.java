package shamrokh.muhammad.leetcode.solution;


public class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];

        // preparing the result characters array according to indices
        for(int i=0;i<s.length();i++){
            result[indices[i]] = s.charAt(i);
        }

        // converting array to String and returning the result
        return new String(result);
    }
}