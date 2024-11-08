package shamrokh.muhammad.leetcode.solution;

class Solution {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];

        for(int i=0;i< prices.length;i++){
            result[i] = prices[i] - getDiscount(i, prices);
        }

        return result;
    }

    private int getDiscount(int index, int[] prices){
        int discount = 0;


        for(int i=index+1;i<prices.length;i++){
            if(prices[index] >= prices[i]){
                discount = prices[i];
                break;
            }
        }

        return discount;
    }
}
