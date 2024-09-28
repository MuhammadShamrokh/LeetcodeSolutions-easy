package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int maxNumberOfBalloons(String text) {
        // array to save character appearances counter in text
        int[] chars = new int[26];
        // iterating over text characters to count each character appearances
        for (char c : text.toCharArray()) {
            chars[c - 'a']++;
        }

        // extracting the min appearances count of the chars b,a,l,o,n which describe the max number of "balloons"
        int min = chars['b' - 'a'];
        min = Math.min(min, chars['a' - 'a']);
        min = Math.min(min, chars['l' - 'a'] / 2);
        min = Math.min(min, chars['o' - 'a'] / 2);
        min = Math.min(min, chars['n' - 'a']);

        return min;
    }
}