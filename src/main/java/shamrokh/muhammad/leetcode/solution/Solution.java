package shamrokh.muhammad.leetcode.solution;


class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<address.length();i++){
            char currentChar = address.charAt(i);

            if(currentChar == '.'){
                sb.append("[.]");
            }
            else
                sb.append(currentChar);
        }

        return sb.toString();
    }
}