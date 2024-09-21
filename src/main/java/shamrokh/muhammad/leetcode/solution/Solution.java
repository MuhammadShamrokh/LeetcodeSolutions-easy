package shamrokh.muhammad.leetcode.solution;

class Solution {
    private final int ALPHABET_COUNT = 26;

    public int countCharacters(String[] words, String chars) {
        int[] charsCount = calculateWordsLettersCounter(chars);
        int formedByCharsWordsTotalLength = 0;

        for(String word:words){
            int[] currentWordCharsCount = calculateWordsLettersCounter(word);

            if(isCharsOneIncludedInCharsTwo(currentWordCharsCount, charsCount)){
                formedByCharsWordsTotalLength += word.length();
            }
        }

        return formedByCharsWordsTotalLength;
    }

    private boolean isCharsOneIncludedInCharsTwo(int[] currentWordCharsCount, int[] charsCount) {
        // iterating over chars count to check if all current word chars are included in received chars
        for(int i=0;i<currentWordCharsCount.length;i++){
            if(currentWordCharsCount[i] > charsCount[i])
                return false;
        }

        return true;
    }

    private int[] calculateWordsLettersCounter(String s){
        int[] wordLettersCount = new int[ALPHABET_COUNT];

        for(int i=0;i<s.length();i++){
            wordLettersCount[s.charAt(i)-'a']++;
        }

        return wordLettersCount;
    }
}