package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.ListNode;
import shamrokh.muhammad.leetcode.datastructure.TreeNode;
import java.util.*;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> cardsCountMap = new HashMap<>();

        // counting appearances of each card
        for(int card : deck)
            cardsCountMap.put(card, cardsCountMap.getOrDefault(card, 0) + 1);

        // calculating the greatest common divisor
        int gcd = -1;
        for(int count: cardsCountMap.values()){
            if(gcd == -1)
                gcd = count;
            else
                gcd = GCD(gcd,count);
        }

        // if greater common divisor is larger than 1, we can split the deck into groups
        return gcd>1;

    }

    private int GCD(int a, int b){
        // The GCD is commonly computed using the Euclidean algorithm
        if(b==0)
            return a;

        return GCD(b, a%b);
    }
}