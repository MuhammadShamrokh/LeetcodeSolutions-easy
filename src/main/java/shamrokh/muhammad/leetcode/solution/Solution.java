package shamrokh.muhammad.leetcode.solution;

public class Solution {
    public int diagonalSum(int[][] mat) {
        int length = mat.length;
        int sum = 0;

        // sum primary diagonal
        for(int i=0;i<length;i++){
            sum += mat[i][i];
        }

        // sum secondary diagonal
        for(int i=length-1;i>=0;i--){
            sum += mat[i][length - i -1];
        }

        // if mat.length is odd, we subtract middle element
        if(length %2 == 1)
            sum -= mat[length/2][length/2];

        return sum;
    }
}


