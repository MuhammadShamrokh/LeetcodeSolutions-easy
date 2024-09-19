package shamrokh.muhammad.leetcode.solution;

import java.util.*;

class Solution {
    private final int ALPHABET_LETTERS_AMOUNT = 26;

    public List<String> commonChars(String[] words) {
        int length = words.length;
        // init an array of counters arrays
        int[][] wordsLettersCountArray = new int[length][ALPHABET_LETTERS_AMOUNT];
        List<String> result = new LinkedList<>();

        // counting letter appearances in each word
        for(int w=0;w<length;w++){
            String currentWord = words[w];
            for(int c=0;c<currentWord.length();c++){
                wordsLettersCountArray[w][currentWord.charAt(c)-'a']++;
            }
        }

        // inserting min appearances of each letter in the result list
        for (int l = 0; l < ALPHABET_LETTERS_AMOUNT; l++) {
            int minLetterAppearances = getMinValueInColumn(wordsLettersCountArray, l);
            char currentChar = (char)('a' + l);

            for(int a=0;a<minLetterAppearances;a++){
                result.add(Character.toString(currentChar));
            }
        }

        return result;
    }

    private int getMinValueInColumn(int[][] counters, int columnNum){
        int min = Integer.MAX_VALUE;

        for(int i=0;i< counters.length;i++){
            min = Math.min(min, counters[i][columnNum]);
        }

        return min;
    }
}