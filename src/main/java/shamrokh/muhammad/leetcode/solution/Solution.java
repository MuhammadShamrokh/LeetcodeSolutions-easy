package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.ListNode;

class Solution {
    private final int BASE = 10;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listOneScanner = l1.next;
        ListNode listTwoScanner = l2.next;

        ListNode resultHead = new ListNode((l1.val + l2.val)%BASE);
        int carry = (l1.val + l2.val)/BASE;
        ListNode resultScanner = resultHead;

        while(listOneScanner != null && listTwoScanner != null){
            int sum = listOneScanner.val + listTwoScanner.val + carry;
            ListNode node = new ListNode();

            node.val = (sum%BASE);
            carry = sum/BASE;

            resultScanner.next = node;
            resultScanner = resultScanner.next;
            listOneScanner = listOneScanner.next;
            listTwoScanner = listTwoScanner.next;

        }

        while(listOneScanner != null){
            int sum = listOneScanner.val + carry;
            ListNode node = new ListNode();

            node.val = (sum%BASE);
            carry = sum/BASE;

            resultScanner.next = node;
            resultScanner = resultScanner.next;
            listOneScanner = listOneScanner.next;
        }

        while(listTwoScanner != null){
            int sum = listTwoScanner.val + carry;
            ListNode node = new ListNode();

            node.val = (sum%BASE);
            carry = sum/BASE;

            resultScanner.next = node;
            resultScanner = resultScanner.next;
            listTwoScanner = listTwoScanner.next;
        }

        if(carry != 0){
            ListNode node = new ListNode(carry);
            resultScanner.next = node;
        }

        return resultHead;

    }
}

