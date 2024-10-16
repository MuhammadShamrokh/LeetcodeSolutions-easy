package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int numberOfSteps(int num) {
        int numberOfStepsCounter = 0;

        while(num>0){
            if(num%2==0){
                num/=2;
            }
            else {
                num-=1;
            }

            numberOfStepsCounter++;
        }

        return numberOfStepsCounter;
    }
}