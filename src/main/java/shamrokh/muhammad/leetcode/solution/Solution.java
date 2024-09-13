package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.ListNode;
import shamrokh.muhammad.leetcode.datastructure.TreeNode;
import java.util.*;

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null)
            return 0;


        // root value in the range
        if(root.val >= low && root.val <= high){
            return rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high) + root.val;
        }

        //root value smaller than the range
        if(root.val < low)
            return rangeSumBST(root.right, low, high);

        //root value bigger than the range
        return rangeSumBST(root.left, low, high);
    }
}