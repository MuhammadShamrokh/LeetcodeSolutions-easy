package shamrokh.muhammad.leetcode.solution;

class Solution {
    public String generateTheString(int n) {
        // n is even, we return ab..b (odd appearances of b)
        if(n%2==0){
            return "a"+"b".repeat(n-1);
        }

        // we return a..a (odd appearances of a)
        return "a".repeat(n);
    }
}

