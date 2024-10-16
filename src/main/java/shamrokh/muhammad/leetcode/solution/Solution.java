package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int divisorSubstrings(int num, int k) {
        String number = Integer.toString(num);
        int divisorsCount = 0;

        // iterating over k-length substrings
        for(int i=0;i<=number.length()-k;i++){
            int currentSubstringValue = Integer.parseInt(number.substring(i,i+k));

            // making sure that the currentSubstringValue is not zero
            if(currentSubstringValue != 0) {
                // checking if num divide by the substring
                if (num % currentSubstringValue == 0)
                    divisorsCount++;
            }
        }

        return divisorsCount;
    }
}