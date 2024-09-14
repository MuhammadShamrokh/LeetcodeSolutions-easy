package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int[] diStringMatch(String s) {
        int length = s.length();
        int lowValues = 0;
        int highValues = length;
        int[] solution = new int[length + 1];


        for(int i=0;i<length;i++)
            solution[i] = s.charAt(i) == 'D'? highValues--: lowValues++;

        // Append the last remaining number (low or high, both are equal at this point)
        // We can also use high since low == high
        solution[length] = lowValues;
        return solution;
    }
}