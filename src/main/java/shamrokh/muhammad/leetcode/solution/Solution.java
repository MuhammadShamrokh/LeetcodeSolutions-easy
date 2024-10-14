package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int subtractProductAndSum(int n) {
        int digitsProduct = 1;
        int digitsSum = 0;

        while(n>0){
            digitsProduct *= n%10;
            digitsSum += n%10;

            n=n/10;
        }

        return digitsProduct - digitsSum;
    }
}