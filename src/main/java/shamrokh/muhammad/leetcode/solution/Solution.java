package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] result = new int[2];

        // iterating over all number from 1 to n-1
        for(int i=1;i<=n/2;i++){
            if(checkIfNonZeroNumber(i) && checkIfNonZeroNumber(n-i)){
                result[0] = i;
                result[1] = n-i;
                break;
            }
        }

        return result;
    }

    private boolean checkIfNonZeroNumber(int n){
        while(n>0){
            if(n%10 == 0)
                return false;

            n/=10;
        }

        return true;
    }
}