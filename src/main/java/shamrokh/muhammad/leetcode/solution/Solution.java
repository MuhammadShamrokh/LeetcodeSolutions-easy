package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int resultCount = 0;

        //iterating over all intervals
        for(int i=0;i<startTime.length;i++){
            //queryTime falls in current student interval
            if(startTime[i]<=queryTime && endTime[i]>=queryTime)
                resultCount++;
        }

        return resultCount;
    }
}
