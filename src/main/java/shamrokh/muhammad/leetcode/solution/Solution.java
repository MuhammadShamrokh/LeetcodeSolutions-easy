package shamrokh.muhammad.leetcode.solution;


import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> result = new LinkedList<>();
        int carry = 0;

        for(int i=num.length - 1;i>=0;i--){
            // extracting current digit in k
            int kDigit = k % 10;
            // executing the sum operation
            int sum = kDigit + num[i] + carry;

            // adding the least significant digit to result
            result.addFirst(sum%10);
            // adding the bigger digit to carry
            carry = sum/10;
            // moving to next digit in k
            k=k/10;
        }

        // iterate over last k digits (in-case k bigger than num)
        while(k > 0){
            int kDigit = k % 10;
            // executing the sum operation
            int sum = kDigit + carry;
            // adding the least significant digit to result
            result.addFirst(sum%10);
            // adding the bigger digit to carry
            carry = sum/10;
            // moving to next digit in k
            k=k/10;
        }

        if(carry == 1) {
            result.addFirst(carry);
        }

        return result;
    }
}