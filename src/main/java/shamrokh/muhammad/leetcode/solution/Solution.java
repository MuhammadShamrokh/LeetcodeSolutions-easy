package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int findNumbers(int[] nums) {
        int resultCounter = 0;

        //iterating over numbers to count numbers with even number of digits
        for(int num:nums){
            int digitsCount = 0;

            // counting the number of digits in num
            while(num > 0){
                num = num/10;
                digitsCount++;
            }

            // counting the word if its number of digits was even
            resultCounter += digitsCount%2==0? 1:0;
        }

        return resultCounter;
    }
}