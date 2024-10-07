package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] incrementsInRowsCount = new int[m];
        int[] incrementsInColsCount = new int[n];
        int oddCellsCounter = 0;

        // counting number of increments in each row and col
        for(int i=0;i<indices.length;i++){
            incrementsInRowsCount[indices[i][0]]++;
            incrementsInColsCount[indices[i][1]]++;
        }

        // scanning matrix to count odd cells
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if((incrementsInRowsCount[r] + incrementsInColsCount[c])%2 == 1)
                    oddCellsCounter++;
            }
        }

        return oddCellsCounter;
    }
}