package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;

        if(n%2==1){
            result[index] = 0;
            index++;
            n--;
        }

        while(n > 0){
            result[index++] = n/2;
            result[index++] = -1*(n/2);

            n -= 2;
        }

        return result;
    }
}