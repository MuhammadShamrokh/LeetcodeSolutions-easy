package shamrokh.muhammad.leetcode.solution;

public class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingPositiveNumbersFound = 0;
        int currentSearchingNumber = 1;
        int currentIndex = 0;

        // iterating over arr elements to detect missing numbers
        while(currentIndex < arr.length){
            if(currentSearchingNumber != arr[currentIndex]){
                // found another missing number
                missingPositiveNumbersFound++;

                //checking if kth Positive
                if(missingPositiveNumbersFound == k)
                    return currentSearchingNumber;

            } else {
                // number we're looking for exists in arr, we move to next index
                currentIndex++;
            }

            currentSearchingNumber++;
        }

        // we did not find kth missing positive number inside arr
        return currentSearchingNumber + (k - missingPositiveNumbersFound) - 1;
    }

}