package shamrokh.muhammad.leetcode.solution;


public class Solution {
    public String reformat(String s) {
        int alphabetCount = 0;
        int numbersCount = 0;

        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                numbersCount++;
            } else {
                // it is guarantee that we have digits or lowercase characters only
                alphabetCount++;
            }
        }

        if(Math.abs(numbersCount-alphabetCount)>1)
            return "";

        if(numbersCount>alphabetCount){
            return buildStringStartWithNumbers(s);
        }

        return buildStringStartWithDigits(s);
    }

    private String buildStringStartWithDigits(String s) {
        char[] result = new char[s.length()];
        int length = s.length();
        int writeIndex = 0;
        int alphaIndex = 0;
        int digitIndex = 0;

        while(alphaIndex < length || digitIndex < length){
            while(alphaIndex < length && !Character.isAlphabetic(s.charAt(alphaIndex))){
                alphaIndex++;
            }

            if(alphaIndex<length) {
                result[writeIndex] = s.charAt(alphaIndex);
                writeIndex++;
                alphaIndex++;
            }

            while(digitIndex < length && !Character.isDigit(s.charAt(digitIndex)) ){
                digitIndex++;
            }

            if(digitIndex < length) {
                result[writeIndex] = s.charAt(digitIndex);
                writeIndex++;
                digitIndex++;
            }
        }

        return String.valueOf(result);
    }

    private String buildStringStartWithNumbers(String s) {
        char[] result = new char[s.length()];
        int length = s.length();
        int writeIndex = 0;
        int alphaIndex = 0;
        int digitIndex = 0;

        while(alphaIndex < length || digitIndex < length){
            while(digitIndex < length && !Character.isDigit(s.charAt(digitIndex)) ){
                digitIndex++;
            }

            if(digitIndex < length) {
                result[writeIndex] = s.charAt(digitIndex);
                writeIndex++;
                digitIndex++;
            }

            while(alphaIndex < length && !Character.isAlphabetic(s.charAt(alphaIndex))){
                alphaIndex++;
            }

            if(alphaIndex<length) {
                result[writeIndex] = s.charAt(alphaIndex);
                writeIndex++;
                alphaIndex++;
            }
        }

        return String.valueOf(result);
    }
}


