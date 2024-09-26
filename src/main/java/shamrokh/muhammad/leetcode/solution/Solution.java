package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int[] biggestRightElement = new int[length];

        // there is no elements to the right of last element in the array
        biggestRightElement[length - 1] = -1;

        // scanning array from the right to the left
        for(int i=length - 2;i>=0;i--){
            // we store the biggest element we say till now in the current index of result array
            biggestRightElement[i] = Math.max(arr[i+1],biggestRightElement[i+1]);
        }

        return biggestRightElement;
    }
}