package shamrokh.muhammad.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public boolean areAnagrams(String wordOne, String wordTwo) {
        int[] wordOneLettersCount = new int[26];
        int[] wordTwoLettersCount = new int[26];

        // counting first word letters
        for(int i=0;i<wordOne.length();i++)
            wordOneLettersCount[wordOne.charAt(i) - 'a']++;

        //counting second word letters
        for(int i=0;i<wordTwo.length();i++)
            wordTwoLettersCount[wordTwo.charAt(i) - 'a']++;

        // checking if anagram (counters need to be equal)
        for(int i=0;i<26;i++){
            if(wordOneLettersCount[i] != wordTwoLettersCount[i])
                return false;
        }

        // if we reach here, both words are anagram
        return true;
    }

    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();

        // Add the first word to the result list
        result.add(words[0]);

        // Iterate through the array, starting from the second word
        for (int i = 1; i < words.length; i++) {
            // If the current word is not an anagram of the previous word, add it to result
            if (!areAnagrams(words[i], words[i - 1])) {
                result.add(words[i]);
            }
        }

        return result;
    }
}