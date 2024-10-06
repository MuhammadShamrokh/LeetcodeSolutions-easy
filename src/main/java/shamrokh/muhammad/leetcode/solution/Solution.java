package shamrokh.muhammad.leetcode.solution;

class Solution {
    public String greatestLetter(String s) {
        int[] uppercaseSeenLetters = new int[26];
        int[] lowercaseSeenLetters = new int[26];
        String maxChar = "";

        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);

            if(Character.isUpperCase(currentChar)){
                char currentLowerCaseCharacter = Character.toLowerCase(currentChar);

                // we faced currentChar lowercase
                if(lowercaseSeenLetters[currentLowerCaseCharacter - 'a'] == 1){
                    // greatest letter so far
                    if(maxChar.isEmpty() || currentChar > maxChar.charAt(0)){
                        maxChar = Character.toString(currentChar);
                    }
                }
                // we did not face currentChar lowercase
                else {
                    // we add the char to the array
                    uppercaseSeenLetters[currentChar - 'A'] = 1;
                }
            } else { //lowercase Letter
                char currentUpperCaseCharacter = Character.toUpperCase(currentChar);

                // we faced currentChar upper case
                if(uppercaseSeenLetters[currentUpperCaseCharacter - 'A'] == 1){
                    // greatest letter so far
                    if(maxChar.isEmpty() || currentUpperCaseCharacter > maxChar.charAt(0)){
                        maxChar = Character.toString(currentUpperCaseCharacter);
                    }
                }
                // we did not face currentChar uppercase
                else {
                    // we add the char to the array
                    lowercaseSeenLetters[currentChar - 'a'] = 1;
                }
            }
        }

        return maxChar;
    }
}