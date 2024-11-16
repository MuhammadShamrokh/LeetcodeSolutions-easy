package shamrokh.muhammad.leetcode.solution;


public class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder().append(n%10);
        int digitCount = 1;
        n /= 10;

        while(n>0){
            // three digits were added, adding separator
            if(digitCount%3==0){
                sb.append(".");
            }

            // adding next digit to string
            int digit = n%10;
            sb.append(digit);
            digitCount++;

            n /= 10;
        }

        // removing extra separator if exists
        if(sb.charAt(sb.length()-1) == '.')
            sb.setLength(sb.length()-1);

        // reversing built string
        return sb.reverse().toString();
    }
}