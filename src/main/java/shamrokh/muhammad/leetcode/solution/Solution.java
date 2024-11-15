package shamrokh.muhammad.leetcode.solution;


public class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int result = 0;

        // checking all triples in arr
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    //checking condition
                    if(Math.abs(arr[i]-arr[j]) <= a && Math.abs(arr[j]-arr[k]) <= b && Math.abs(arr[i]-arr[k]) <= c)
                        result++;
                }
            }
        }

        return result;
    }
}