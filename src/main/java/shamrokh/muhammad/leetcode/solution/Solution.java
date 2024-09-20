package shamrokh.muhammad.leetcode.solution;


import shamrokh.muhammad.leetcode.datastructure.TreeNode;
import shamrokh.muhammad.leetcode.utility_objects.Cell;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    // Class to store cell coordinates and their Manhattan distance


    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        // Min-heap to store cells based on Manhattan distance
        PriorityQueue<Cell> minHeap = new PriorityQueue<>();

        // Step 1: Add all cells with their distances to the heap
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int dist = Math.abs(r - rCenter) + Math.abs(c - cCenter);
                minHeap.add(new Cell(r, c, dist));
            }
        }

        // Step 2: Extract cells from the heap in sorted order
        int[][] result = new int[rows * cols][2];
        int index = 0;
        while (!minHeap.isEmpty()) {
            Cell cell = minHeap.poll(); // Get the cell with the smallest distance
            result[index++] = new int[] {cell.getRow(), cell.getCol()};
        }

        return result;
    }
}