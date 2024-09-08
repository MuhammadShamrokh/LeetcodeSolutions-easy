package shamrokh.muhammad.leetcode.solution;


import java.util.*;

class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int [][] transpose = new int[columns][rows];

        // executing transpose
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                transpose[c][r] = matrix[r][c];
            }
        }

        return transpose;
    }
}