package shamrokh.muhammad.leetcode.solution;


class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // condition to check if both strings have same repeating pattern
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }

        // calculating the greater divisor length
        // (the longest repeating substring pattern)
        int greaterCommonDivisorLength = calculateGreaterCommonDivisor(str1.length(), str2.length());

        return str1.substring(0, greaterCommonDivisorLength);
    }

    private int calculateGreaterCommonDivisor(int a, int b){
        if(b==0){
            return a;
        }

        return calculateGreaterCommonDivisor(b, a%b);
    }
}