package shamrokh.muhammad.leetcode.solution;

class Solution {
    private final int MAX_FOUR_DIGITS_SUM = 37;
    public int countLargestGroup(int n) {
        int[] groupsSize = new int[MAX_FOUR_DIGITS_SUM];
        int maxGroupSize = 0;
        int groupsWithMaxSize = 0;

        // iterating over the numbers [1, n]
        for(int i=1;i<=n;i++){
            // sum the digits
            int digitsSum = sumNumDigits(i);

            // add result to corresponding group
            groupsSize[digitsSum]++;
        }

        // finding the number of groups with max size
        for(int size:groupsSize){
            if(size > maxGroupSize){
                maxGroupSize = size;
                groupsWithMaxSize = 1;
            }
            else if(size == maxGroupSize){
                groupsWithMaxSize++;
            }
        }

        return groupsWithMaxSize;
    }

    private int sumNumDigits(int num) {
        int digitsSum = 0;

        while(num > 0){
            digitsSum += (num%10);
            num /=10;
        }

        return digitsSum;
    }
}


