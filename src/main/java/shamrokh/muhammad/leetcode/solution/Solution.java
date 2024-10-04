package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int balancedStringSplit(String s) {
        // result will be zero in the first iteration of loop
        int result = -1;
        int counter = 0;
        char currentChar = s.charAt(0);


        for(int i=0;i<s.length();i++) {
            // start of new balanced string
            if (counter == 0) {
                currentChar = s.charAt(i);
                counter++;
                result++;
                continue;
            }

            // same character, we increase counter
            if (s.charAt(i) == currentChar)
                counter++;
            else // different character, we decrease counter
                counter--;
        }

        // string s is build from balanced substrings
        // last balanced substring is not counted in loop, that is why we return result +1
        return result + 1;
    }
}