package shamrokh.muhammad.leetcode.solution;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] textWords = text.split(" ");
        List<String> result = new ArrayList<>();

        if(textWords.length < 3)
            return new String[]{};

        for(int i=0;i< textWords.length-2;i++){
            if(textWords[i].equals(first)) {
                if (textWords[i + 1].equals(second)) {
                    result.add(textWords[i+2]);
                }
            }
        }

        String[] resultArray = new String[result.size()];

        for(int i=0;i< result.size();i++){
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }

}