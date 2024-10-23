package shamrokh.muhammad.leetcode.solution;


class Solution {
    public int findLucky(int[] arr) {
        // 1 <= arr[i] <= 500
        int[] numbersCountArray = new int[501];
        int largestLuckyNumber = -1;

        // counting each number appearances
        for(int num:arr){
            numbersCountArray[num]++;
        }

        // iterating over arr to find the largest lucky number
        for(int num:arr){
            //lucky number
            if(num == numbersCountArray[num]){
                if(num > largestLuckyNumber)
                {
                    largestLuckyNumber = num;
                }
            }
        }

        return largestLuckyNumber;
    }
}


