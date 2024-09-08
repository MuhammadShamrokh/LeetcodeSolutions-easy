package shamrokh.muhammad.leetcode.solution;


import java.util.*;

class Solution {
    public boolean buddyStrings(String s, String goal) {
        // edge case: not same length strings, for sure not buddy strings
        if(s.length() != goal.length())
            return false;

        // if s and goal strings are equals, we check if we have the same letter twice in s so we switch them
        // otherwise, we return false
        if(s.equals(goal)){
            return checkIfStringHasTwoSameLetters(s);
        }

        // if we reach here that mean that s and goal are not equal (with same length)
        // we check the number of different chars
        //          if 2 only then return true otherwise false;
        int numOfDifferences = 0;
        int difOneIndex =0;
        int difTwoIndex = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != goal.charAt(i)) {
                numOfDifferences++;
                if(numOfDifferences == 1){
                    difOneIndex = i;
                }
                if(numOfDifferences == 2){
                    difTwoIndex = i;

                    boolean equals = s.charAt(difOneIndex) == goal.charAt(difTwoIndex) && s.charAt(difTwoIndex) == goal.charAt(difOneIndex);
                    if(!equals)
                        return false;
                }

                if(numOfDifferences > 2)
                    return false;
            }
        }

        return numOfDifferences == 2;
    }

    private boolean checkIfStringHasTwoSameLetters(String s) {
        Set<Character> stringCharacters = new HashSet<>();

        for(int i=0;i<s.length();i++){
            if(stringCharacters.contains(s.charAt(i)))
                return true;

            stringCharacters.add(s.charAt(i));
        }

        return false;
    }
}