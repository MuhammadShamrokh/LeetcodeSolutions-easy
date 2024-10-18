package shamrokh.muhammad.leetcode.solution;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    private static class Power implements Comparable<Power>{
        private final int soldiers;
        private final int index;

        public Power(int soldiers, int index) {
            this.soldiers = soldiers;
            this.index = index;
        }

        @Override
        public int compareTo(Power o) {
            if(this.soldiers != o.soldiers)
                return this.soldiers - o.soldiers;

            return this.index - o.index;
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Power> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int[] result = new int[k];

        // scanning all matrix rows
        for(int i=0;i<mat.length;i++){
            int[] currentRow = mat[i];
            int soldiersCount = 0;

            // iterating over row values to count soldiers
            for(int value : currentRow) {
                if (value == 0)
                    break;

                soldiersCount++;
            }

            // adding power to min heap
            maxHeap.add(new Power(soldiersCount, i));
            // the size is bigger than k, we remove the biggest element
            // we stay with smaller values
            if(maxHeap.size() > k){
                maxHeap.remove();
            }
        }

        // building result array
        for(int i=0;i<k;i++){
            result[k-1-i] = maxHeap.remove().index;
        }

        return result;
    }
}