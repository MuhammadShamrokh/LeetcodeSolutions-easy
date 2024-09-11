package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.ListNode;
import shamrokh.muhammad.leetcode.datastructure.TreeNode;
import java.util.*;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> bobSizesSet = new HashSet<>();
        // calculate the total amount of candies that bob and alice has
        int sumAlice = 0;
        int sumBob = 0;
        for(int size: aliceSizes)
            sumAlice += size;
        for(int size: bobSizes){
            sumBob += size;
            bobSizesSet.add(size);
        }


        // calculate the delta
        int delta = (sumBob - sumAlice) / 2;

        // Iterate over Alice's candy sizes
        for (int aliceSize : aliceSizes) {
            // Check if there is a candy in Bob's set that matches x + delta
            if (bobSizesSet.contains(aliceSize + delta)) {
                return new int[] {aliceSize, aliceSize + delta};
            }
        }

        //it is guarantee that we have a solution, we wont reach here
        return new int[]{};
    }
}