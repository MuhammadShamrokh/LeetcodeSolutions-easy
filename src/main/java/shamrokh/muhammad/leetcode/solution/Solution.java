package shamrokh.muhammad.leetcode.solution;

public class Solution {

    public int numIdenticalPairs(int[] nums) {
        int[] counters = new int[100];
        int result = 0;

        // counting number of appearances for each element
        for(int elem:nums)
            counters[elem-1]++;

        //for each count >= 2, we have 1+2+...+(count-1) pairs
        for(int count:counters)
            if(count >= 2)
                result += sumTillN(count - 1);

        return result;
    }

    private int sumTillN(int n){
        return (n*(n+1))/2;
    }
}