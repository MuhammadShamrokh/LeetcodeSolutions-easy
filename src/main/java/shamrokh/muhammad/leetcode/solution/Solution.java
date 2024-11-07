package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        // converting sentence into words
        String[] words = sentence.split(" ");

        //iterating over words to find a word that searchWord is a prefix
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(searchWord))
                return i+1;
        }

        return -1;
    }
}
