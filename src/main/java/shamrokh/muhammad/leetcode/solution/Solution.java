package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder(Integer.toString(num));

        // iterating num from MSD to LSD
        for(int i=0;i<sb.length();i++){
            // we convert the first appearance of 6 to 9
            if(sb.charAt(i)=='6') {
                sb.setCharAt(i, '9');
                break;
            }
        }

        return Integer.parseInt(sb.toString());
    }
}