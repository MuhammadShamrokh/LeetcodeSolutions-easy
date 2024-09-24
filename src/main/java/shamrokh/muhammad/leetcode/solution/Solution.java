package shamrokh.muhammad.leetcode.solution;


import java.util.Arrays;

class Solution {
    public double trimMean(int[] arr) {
        int length = arr.length;
        int fivePercentOfElements = (int)(length*0.05);
        int sum=0;

        // sorting array
        Arrays.sort(arr);
        // iterating over array to calculate mean
        for(int i=fivePercentOfElements;i<length-fivePercentOfElements;i++)
            sum+=arr[i];

        return (double) sum /(length - fivePercentOfElements*2);

    }
}