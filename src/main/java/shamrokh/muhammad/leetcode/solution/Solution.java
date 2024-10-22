package shamrokh.muhammad.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int[] minElementInEachRow = findMinElementInArrayRows(matrix);
        int[] maxElementInEachColumn = findMaxElementInArrayColumns(matrix);
        List<Integer> result = new ArrayList<>();

        for(int min:minElementInEachRow){
            for(int max:maxElementInEachColumn){
                if(min==max){
                    result.add(min);
                }
            }
        }

        return result;
    }

    private int[] findMaxElementInArrayColumns(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] maxColumnsElements = new int[columns];


        for(int i=0;i<columns;i++){
            int maxInColumn = matrix[0][i];

            for(int j=1;j<rows;j++){
                if(maxInColumn<matrix[j][i])
                    maxInColumn = matrix[j][i];
            }

            maxColumnsElements[i] = maxInColumn;
        }

        return maxColumnsElements;
    }

    private int[] findMinElementInArrayRows(int[][] matrix) {
        int numOfRows = matrix.length;
        int[] result = new int[numOfRows];

        // building min element in each row array
        for(int i=0;i<numOfRows;i++){
            result[i] = findMinElementInRow(matrix[i]);
        }

        return result;
    }

    private int findMinElementInRow(int[] row) {
        int min = row[0];

        for(int i=1;i<row.length;i++){
            if(min>row[i])
                min = row[i];
        }

        return min;
    }
}
