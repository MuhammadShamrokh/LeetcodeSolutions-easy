package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int tribonacci(int n) {
        // edge cases, n smaller than 3
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;

        return calculateTribunacciNumber(n);
    }

    private int calculateTribunacciNumber(int n) {
        int[] calculationArray = new int[3];
        calculationArray[1] = 1;
        calculationArray[2] = 1;

        for(int i=3;i<=n;i++){
            calculationArray[i%3] = calculationArray[0] + calculationArray[1] + calculationArray[2];
        }

        return calculationArray[n%3];
    }
}