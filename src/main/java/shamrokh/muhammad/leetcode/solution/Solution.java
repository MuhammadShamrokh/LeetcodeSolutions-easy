package shamrokh.muhammad.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> dictionaryCharactersOrder = new HashMap<>();

        // storing characters order in a map
        for(int i=0;i<order.length();i++){
            dictionaryCharactersOrder.put(order.charAt(i),i);
        }

        // iterating over array to check if all words are in alphabet order
        for(int i=0;i<words.length - 1;i++){
            if(!isRightOrderAlpha(dictionaryCharactersOrder, words[i], words[i+1]))
                return false;
        }

        return true;
    }

    private boolean isRightOrderAlpha(Map<Character,Integer> order, String word1, String word2){
        int scanner =0;

        while(scanner < word1.length() && scanner < word2.length()){
            int charOneOrder = order.get(word1.charAt(scanner));
            int charTwoOrder = order.get(word2.charAt(scanner));

            if(charOneOrder == charTwoOrder)
                scanner++;
            else return charOneOrder <= charTwoOrder;
        }

        return scanner == word1.length();
    }
}