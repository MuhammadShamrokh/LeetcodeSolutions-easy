package shamrokh.muhammad.leetcode.solution;

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length == 1 || arr.length == 2)
            return false;

        int scanner = 0;
        int consecutiveOddNumbersCount = 0;

        // scanning arr array to check if there is consecutive 3 odd numbers
        while(scanner < arr.length){
            // the current number is odd
            if(arr[scanner]%2 == 1){
                consecutiveOddNumbersCount++;

                // checking if we found 3 consecutive odd numbers
                if(consecutiveOddNumbersCount == 3)
                    return true;
            }
            else { // even number, we reset counter to 0
                consecutiveOddNumbersCount = 0;
            }

            scanner++;
        }
        return false;
    }
}