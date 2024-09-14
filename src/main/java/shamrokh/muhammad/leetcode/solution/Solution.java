package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int minDeletionSize(String[] strs) {
        int numOfStrings = strs.length;
        int stringsLength = strs[0].length();
        int columnsToDelete = 0;

        // iterating over all columns
        for (int j = 0; j < stringsLength; j++) {
            for (int i = 0; i < numOfStrings - 1; i++) {
                // checking if this is unordered column
                if (strs[i].charAt(j) > strs[i + 1].charAt(j)) {
                    columnsToDelete++;
                    break;
                }
            }
        }

        return columnsToDelete;

    }
}