package shamrokh.muhammad.leetcode.solution;

import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        //edge case, received 1 stone
        if(stones.length == 1)
            return stones[0];

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        // filling stones in priority queue
        for(int stone:stones){
            maxHeap.add(stone);
        }

        while(maxHeap.size() > 1){
            int firstStone = maxHeap.poll();
            int secondStone = maxHeap.poll();

            if(firstStone != secondStone)
                maxHeap.add(firstStone-secondStone);
        }

        return maxHeap.isEmpty()? 0:maxHeap.poll();
    }
}