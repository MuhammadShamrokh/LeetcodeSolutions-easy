package shamrokh.muhammad.leetcode.solution;

import java.util.HashSet;
import java.util.Set;

class Solution{
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> brokenLettersSet = new HashSet<>();
        String[] words = text.split(" ");
        boolean brokenWord;
        int wordsCount = 0;

        //filling set with broken letters
        for(int i=0;i<brokenLetters.length();i++){
            brokenLettersSet.add(brokenLetters.charAt(i));
        }

        // iterating over words to check which we can type
        for(String word:words){
            brokenWord = false;

            for(int i=0;i<word.length();i++) {
                if (brokenLettersSet.contains(word.charAt(i))) {
                    brokenWord = true;
                    break;
                }
            }
            if(!brokenWord)
                wordsCount++;
        }

        return wordsCount;
    }
}