package shamrokh.muhammad.leetcode.solution;


public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int columns = image[0].length;
        int[][] result = new int[rows][columns];

        for(int r=0;r<rows;r++){
            // flipping and inverting the image row
            for(int c=0;c<columns;c++){
                result[r][c] = image[r][columns-c-1] == 0? 1:0;
            }
        }

        return result;
    }
}
