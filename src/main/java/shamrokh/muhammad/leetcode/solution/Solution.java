package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int minCostToMoveChips(int[] position) {
        int oddCount = 0;
        int evenCount = 0;

        // Count chips at odd and even positions
        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // The minimum cost will be the smaller count
        return Math.min(oddCount, evenCount);
    }
}

