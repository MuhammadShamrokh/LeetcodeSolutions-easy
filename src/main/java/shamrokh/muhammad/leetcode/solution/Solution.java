package shamrokh.muhammad.leetcode.solution;


public class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        // implementing sliding window to iterate over all m length sub-arrays
        int currentPatternStart = 0;
        int currentPatternEnd = m;
        int currentCheckPatternStart = 0;
        int currentCheckPatternEnd = m;
        int currentConsecutiveCounter = 0;

        while(currentCheckPatternEnd <= arr.length){
            if(checkIfSubArraysEqual(arr,currentPatternStart,currentPatternEnd,currentCheckPatternStart,currentCheckPatternEnd)){
                currentConsecutiveCounter++;

                if(currentConsecutiveCounter >=k)
                    return true;

                currentCheckPatternStart += m;
                currentCheckPatternEnd += m;
            } else {
                currentConsecutiveCounter = 0;
                currentPatternStart = currentCheckPatternStart;
                currentPatternEnd = currentCheckPatternEnd;
            }
        }

        return false;
    }

    private boolean checkIfSubArraysEqual(int[] arr, int start1, int end1, int start2, int end2){
        // not equal sub-arrays
        if(end2-start2 != end1-start1)
            return false;

        while(start1 < end1){
            if(arr[start1] != arr[start2])
                return false;

            start1++;
            start2++;
        }

        return true;
    }
}


