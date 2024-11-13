package shamrokh.muhammad.leetcode.solution;


class Solution {
    public int xorOperation(int n, int start) {
        int result = start;
        int currentElement = start;

        for(int i=1;i<n;i++){
            currentElement += 2;
            result ^= currentElement;
        }

        return result;
    }
}