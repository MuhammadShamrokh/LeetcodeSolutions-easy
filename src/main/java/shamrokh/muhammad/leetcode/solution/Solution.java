package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        boolean biggerDistanceThanInput;
        int resultCounter = 0;

        for (int num1 : arr1) {
            biggerDistanceThanInput = true;

            for (int num2 : arr2) {
                if (Math.abs(num1 - num2) <= d) {
                    biggerDistanceThanInput = false;
                    break;
                }
            }

            if (biggerDistanceThanInput)
                resultCounter++;
        }

        return resultCounter;
    }
}

