package shamrokh.muhammad.leetcode.solution;

import java.util.*;

class Solution {
    public int bitwiseComplement(int n) {
        // edge case, received number is 0
        if(n==0)
            return 1;

        int sum =0;
        int bitIndex = 0;

        while(n > 0){
            sum  += n%2==0? (int)Math.pow(2, bitIndex):0;
            bitIndex++;
            n /=2;
        }

        return sum;
    }
}