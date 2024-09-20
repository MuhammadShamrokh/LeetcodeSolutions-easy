package shamrokh.muhammad.leetcode.solution;


class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int arraySum = sumOfArray(arr);

        // if array sum is not divisible by 3, then we cant partition
        if(arraySum%3 != 0){
            return false;
        }

        int partitionSum = arraySum/3;
        int partitionsCount = 0;
        arraySum = 0;

        for(int i=0;i<arr.length;i++){
            arraySum += arr[i];

            // we found a partition
            if(arraySum == partitionSum){
                partitionsCount += 1;
                arraySum = 0;
            }

            // If we find 2 valid partitions before the end of the array,
            // we return true, because the third part will automatically work
            if(partitionsCount == 2 && i<arr.length-1)
                return true;
        }

        // we did not find 2 partitions before end of array
        // we return false because we cant split array into 3 equal parts
        return false;
    }

    private int sumOfArray(int[] arr){
        int sum=0;

        for(int elem:arr){
            sum+=elem;
        }

        return sum;
    }
}