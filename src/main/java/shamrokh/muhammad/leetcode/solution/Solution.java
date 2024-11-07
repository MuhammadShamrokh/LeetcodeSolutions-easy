package shamrokh.muhammad.leetcode.solution;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] arrCharsCounters = new int[1000];
        int[] targetCharsCounters = new int[1000];

        //counting elements appearances in array arr
        for(int elem:arr){
            arrCharsCounters[elem-1]++;
        }

        //counting elements appearances in array target
        for(int elem:target){
            targetCharsCounters[elem-1]++;
        }

        //checking if both arrays have same elements with same amount of appearances
        //if no, then we can not move from arr to target by reversing sub arrays
        for(int i=0;i<arrCharsCounters.length;i++){
            if(arrCharsCounters[i] != targetCharsCounters[i])
                return false;
        }

        //both arrays have same elements with same amount of appearances
        //we can move from arr to target by reversing sub arrays
        return true;
    }
}
