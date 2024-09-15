package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.TreeNode;


class Solution {
    public int fib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;

        int[] fiboNumbers = new int []{0,1};

        for(int i=2;i<=n;i++) {
            fiboNumbers[i%2] = fiboNumbers[0] + fiboNumbers[1];
        }

        return fiboNumbers[n%2];
    }
}