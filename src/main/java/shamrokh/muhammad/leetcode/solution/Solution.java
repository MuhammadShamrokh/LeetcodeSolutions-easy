package shamrokh.muhammad.leetcode.solution;

public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int numOfEmptyBottles = 0;
        int maxNumberOfBottles = 0;

        // we loop while we have more bottles to drink
        while(numBottles > 0){
            // drink bottles and update counter
            maxNumberOfBottles += numBottles;
            numOfEmptyBottles += numBottles;

            // exchange empty bottles for full bottles
            numBottles = numOfEmptyBottles / numExchange;
            // reduce the exchanged empty bottles from the number of empty bottles
            numOfEmptyBottles -= numBottles * numExchange;
        }

        return maxNumberOfBottles;
    }
}