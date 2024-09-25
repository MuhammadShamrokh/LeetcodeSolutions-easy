package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int findSpecialInteger(int[] arr) {
        int length = arr.length;
        double fiftyTwoPercent = length * 0.25;
        int elementCounter = 0;
        int currentElement = arr[0];

        // iterating over elements to find element with requirement appearances amount
        for (int elem : arr) {
            if (elem == currentElement) {
                elementCounter++;
            } else {
                // new element, checking if the prev element answers the appearances requirements
                if (elementCounter > fiftyTwoPercent)
                    return currentElement;

                // the previous element did not appear more than 25% of the array length
                currentElement = elem;
                elementCounter = 1;
            }
        }

        // the element did not appear in the middle of the array
        // the wanted element must be the last element
        return arr[length-1];
    }
}