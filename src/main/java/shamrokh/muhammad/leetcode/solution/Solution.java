package shamrokh.muhammad.leetcode.solution;


import java.util.*;

class Solution {
    private final int FIVE_CHANGE_IDX = 0;
    private final int TEN_CHANGE_IDX = 1;
    public boolean lemonadeChange(int[] bills) {
        int[] change = new int[2];

        for(int i=0;i<bills.length;i++){
            switch(bills[i])
            {
                case 5:
                    // we keep the five as a change for future purchases
                    change[FIVE_CHANGE_IDX]++;
                    break;
                case 10:
                    // we dont have to give back
                    if(change[FIVE_CHANGE_IDX] == 0)
                        return false;

                    //we had change, we update array of changes
                    change[TEN_CHANGE_IDX]++;
                    change[FIVE_CHANGE_IDX]--;
                    break;
                case 20:
                    // we prefer to get rid of 10 and keep 5 for future purchases
                    if(change[FIVE_CHANGE_IDX] > 0 && change[TEN_CHANGE_IDX] > 0){
                        change[TEN_CHANGE_IDX]--;
                        change[FIVE_CHANGE_IDX]--;
                    }
                    // no tens to give back, we must give three 5's instead
                    else if(change[FIVE_CHANGE_IDX] >= 3){
                        change[FIVE_CHANGE_IDX]-=3;
                    }
                    else{
                        // no change to give back
                        return false;
                    }
                    break;
                default:
                    throw new RuntimeException("Invalid Payment value");
            }
        }

        // if we reach here, that means we made all the sells and gave change to everyone
        return true;
    }
}