package shamrokh.muhammad.leetcode.solution;


import shamrokh.muhammad.leetcode.datastructure.ListNode;
import shamrokh.muhammad.leetcode.datastructure.TreeNode;

import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> uncommonWords = new ArrayList<>();
        // counting words in each sentence and storing result into maps
        Map<String,Integer> firstStringWordsCount = countStringWords(s1);
        Map<String,Integer> secondStringWordsCount = countStringWords(s2);

        // scanning first sentence words to find uncommon words in string one
        for(Map.Entry<String,Integer> entry: firstStringWordsCount.entrySet()){
            if(entry.getValue() == 1 && !secondStringWordsCount.containsKey(entry.getKey()))
                uncommonWords.add(entry.getKey());
        }

        // scanning second sentence words to find uncommon words in string two
        for(Map.Entry<String,Integer> entry: secondStringWordsCount.entrySet()){
            if(entry.getValue() == 1 && !firstStringWordsCount.containsKey(entry.getKey()))
                uncommonWords.add(entry.getKey());
        }

        String[] result = new String[uncommonWords.size()];
        for(int i=0;i<uncommonWords.size();i++){
            result[i] = uncommonWords.get(i);
        }

        return result;
    }

    private Map<String, Integer> countStringWords(String sentence){
        Map<String,Integer> sentenceWordCount = new HashMap<>();

        // counting first string words appearances
        for(String word: sentence.split(" ")){
            sentenceWordCount.put(word, sentenceWordCount.getOrDefault(word,0)+1);
        }

        return sentenceWordCount;
    }
}