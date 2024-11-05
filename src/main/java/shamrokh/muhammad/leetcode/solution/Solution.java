package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int maxScore(String s) {
        int scanner = 1;
        int numOfZerosInSubstringOne = s.charAt(0)=='0'? 1:0;
        int numOfOnesInSubstringTwo = 0;

        //counting number of "ONE" in initial substring two{
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='1'){
                numOfOnesInSubstringTwo++;
            }
        }

        int max = numOfZerosInSubstringOne + numOfOnesInSubstringTwo;

        // iterating over all possible substring
        while(scanner < s.length() - 1){
            // moving zero to substring one
            if(s.charAt(scanner) == '0'){
                numOfZerosInSubstringOne++;
            } else { // moving one to substring one
                numOfOnesInSubstringTwo--;
            }

            // checking if the score is higher in the current split
            max = Math.max(max, numOfOnesInSubstringTwo + numOfZerosInSubstringOne);
            scanner++;
        }

        return max;
    }
}


