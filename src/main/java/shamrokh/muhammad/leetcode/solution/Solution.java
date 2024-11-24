package shamrokh.muhammad.leetcode.solution;

public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int oddArraySize = 1;

        while(oddArraySize <= arr.length){
            sum += sumAllSubArraysInSizeN(arr, oddArraySize);
            oddArraySize += 2;
        }

        return sum;
    }

    private int sumAllSubArraysInSizeN(int[] arr, int n){
        int length = arr.length;
        if(n>length){
            return 0;
        }
        if(n==length){
            return sumArr(arr,0,length);
        }

        int start = 0;
        int end = n;
        int slidingWindowSum=sumArr(arr, start, end);
        int result=slidingWindowSum;

        while(end < length){
            // moving sliding window left pointer
            slidingWindowSum -= arr[start];
            start++;
            // moving sliding window right pointer
            slidingWindowSum += arr[end];
            end++;

            // adding current sliding window sum to total sum result
            result += slidingWindowSum;
        }

        return result;
    }

    private int sumArr(int[] arr, int from, int to){
        int result = 0;

        for(int i=from;i<to;i++){
            result += arr[i];
        }

        return result;
    }


}