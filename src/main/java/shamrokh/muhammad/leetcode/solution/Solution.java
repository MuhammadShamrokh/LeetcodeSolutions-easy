package shamrokh.muhammad.leetcode.solution;


import java.util.*;

class Solution {
    public int binaryGap(int n) {
        int longestGap = 0;
        int prevOneBitLocation = 0;
        int location = 1;

        while(n>0){
            // turned on bit was found
            if(n%2 != 0){
                // first 1 bit appearance
                if(prevOneBitLocation == 0)
                    prevOneBitLocation = location;
                else{
                    longestGap = Math.max(longestGap, location - prevOneBitLocation);
                    prevOneBitLocation = location;
                }
            }

            location ++;
            n /= 2;
        }

        return longestGap;
    }
}