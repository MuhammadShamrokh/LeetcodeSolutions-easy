package shamrokh.muhammad.leetcode.solution;


class Solution {
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        int[] lettersCount = new int[26];
        boolean changed = true;


        // scanning s characters to count them
        for(int i=0;i<s.length();i++){
            lettersCount[s.charAt(i) - 'a']++;
        }

        while(changed) {
            changed = false;

            for(int i=0;i<26;i++){
                if(lettersCount[i] != 0){
                    sb.append((char)(i + 'a'));
                    lettersCount[i]--;
                    changed = true;
                }
            }

            for(int i=25;i>=0;i--){
                if(lettersCount[i] != 0){
                    sb.append((char)(i + 'a'));
                    lettersCount[i]--;
                    changed = true;
                }
            }
        }

        return sb.toString();
    }
}

