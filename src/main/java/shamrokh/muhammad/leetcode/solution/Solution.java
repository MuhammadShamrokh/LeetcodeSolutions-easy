package shamrokh.muhammad.leetcode.solution;


import shamrokh.muhammad.leetcode.datastructure.ListNode;
import shamrokh.muhammad.leetcode.datastructure.TreeNode;

import java.util.*;

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fastScanner = head;
        ListNode slowScanner = head;
        int nodesInPathCount = 0;

        // implement slow and fast scanner method to find middle of listNode
        while(fastScanner.next != null && fastScanner.next.next != null){
            fastScanner = fastScanner.next.next;
            slowScanner = slowScanner.next;
            nodesInPathCount++;
        }

        // if while loop stopped because fastScanner.next == null (this scanner jump by 2 nodes)
        //    the size of the list is odd, which mean slowScanner is the only middle of the list.
        // otherwise we have 2 middle nodes, we return the 2nd node.
        return fastScanner.next == null ? slowScanner: slowScanner.next;
    }
}