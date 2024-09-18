package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.TreeNode;

import java.util.*;

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustingCounter = new int[n];
        int[] trustedByCounter = new int[n];

        // for each person,
        // we count the amount of people he trusts
        // and the amount of people he is trusted by
        for(int i=0;i<trust.length;i++){
            trustingCounter[trust[i][0] - 1]++;
            trustedByCounter[trust[i][1] - 1]++;
        }

        // iterating over all people counters
        for(int i=0;i<n;i++){
            // checking if the person is trusted by n-1
            if(trustedByCounter[i] == n-1)
                // checking if the person trust nobody
                if(trustingCounter[i] == 0)
                    return i + 1;
        }

        // we did not find any town judge
        return -1;
    }
}