package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int maxPower(String s) {
        int max = 1;
        int currentCount = 1;
        char currentChar = s.charAt(0);

        for(int i=1;i<s.length();i++){
            // new character, we reset counter
            if(s.charAt(i) != currentChar){
                currentChar = s.charAt(i);
                currentCount = 0;
            }

            currentCount++;
            max = Math.max(currentCount,max);
        }

        return max;
    }
}


