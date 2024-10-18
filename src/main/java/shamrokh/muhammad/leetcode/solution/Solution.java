package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int removePalindromeSub(String s) {
        return isPalindrome(s)? 1:2;
    }

    private boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while(start<end){
            if(s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
}