package shamrokh.muhammad.leetcode.solution;

class RecentCounter {
    private final int MAX_PINGS_AMOUNT = 10000;
    private final int TIME_IN_MILLISECONDS = 3000;
    private int[] pingsTime;
    private int currentIndex;
    public RecentCounter() {
         this.pingsTime = new int[MAX_PINGS_AMOUNT];
         currentIndex = 0;
    }

    public int ping(int t) {
        int counter = 0;

        // we save the ping time
        pingsTime[currentIndex] = t;
        currentIndex++;

        // count request in last t - TIME_IN_MILLISECONDS
        for(int i=currentIndex - 1;i>=0;i--){
            if(t-TIME_IN_MILLISECONDS <= pingsTime[i])
                counter++;
            else
                break;
        }

        return counter;
    }
}