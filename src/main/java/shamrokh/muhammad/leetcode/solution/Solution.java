package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.ListNode;

class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode scanner = head;
        int result = 0;

        while(scanner != null){
            result = result * 2 + scanner.val;
            scanner = scanner.next;
        }

        return result;
    }
}