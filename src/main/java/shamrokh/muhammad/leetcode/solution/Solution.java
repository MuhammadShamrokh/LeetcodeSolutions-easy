package shamrokh.muhammad.leetcode.solution;

class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();

        // iterating over s characters to map it to string
        for(int i=0;i<s.length();i++){
            char currentChar;

            switch (s.charAt(i)) {
                case '1', '2' -> {
                    // Characters ('j' to 'z')
                    if(i+2<s.length() && s.charAt(i+2)=='#'){
                        currentChar = (char)('a' + Integer.parseInt(s.substring(i,i+2)) - 1);
                        i+=2;
                    } else { // Characters ('a' to 'b')
                        currentChar = (char)('a' + (s.charAt(i) - '0' - 1));
                    }

                    sb.append(currentChar);
                }
                //Characters ('a' to 'i')
                default -> {
                    currentChar = (char)('a' + (s.charAt(i) - '0' - 1));
                    sb.append(currentChar);
                }


            }
        }

        return sb.toString();
    }
}