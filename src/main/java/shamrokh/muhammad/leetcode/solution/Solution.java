package shamrokh.muhammad.leetcode.solution;


class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        // Step 1: Create a frequency map to store normalized dominoes
        int[] count = new int[100];  // We use an array because a pair [a, b] can be represented as a two-digit number a*10 + b
        int result = 0;

        for (int[] domino : dominoes) {
            int a = domino[0];
            int b = domino[1];
            // Normalize the domino
            int val = Math.min(a, b) * 10 + Math.max(a, b);  // Convert the domino into a two-digit number
            // nC2 = n(n-1)/2 which is the sum of all elements from 1 to n
            result += count[val];  // Add the current count of this domino to the result
            count[val]++;  // Increment the count of this domino
        }

        return result;
    }

    /*
    private int nCr(int n, int r)
    {
        return fact(n) / (fact(r) *
                fact(n - r));
    }

    // Returns factorial of n
    private int fact(int n)
    {
        if(n==0 || n==1)
            return 1;
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }

     */
}