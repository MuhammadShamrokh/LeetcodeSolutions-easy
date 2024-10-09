package shamrokh.muhammad.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int columns = grid[0].length;
        int totalElements = rows * columns;

        // Result grid to store the shifted elements
        List<List<Integer>> result = new ArrayList<>();

        // Flatten the grid to a 1D array
        int[] flatGrid = new int[totalElements];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                flatGrid[i * columns + j] = grid[i][j];
            }
        }

        // Calculate the new grid after shifting
        int[] shiftedGrid = new int[totalElements];
        for (int i = 0; i < totalElements; i++) {
            // Calculate the new index after k shifts
            shiftedGrid[(i + k) % totalElements] = flatGrid[i];
        }

        // Rebuild the 2D grid from the shifted 1D array
        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                row.add(shiftedGrid[i * columns + j]);
            }
            result.add(row);
        }

        return result;
    }
}