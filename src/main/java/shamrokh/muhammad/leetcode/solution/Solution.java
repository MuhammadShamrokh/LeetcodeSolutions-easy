package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.TreeNode;


class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root==null)
            return true;

        if(root.left != null && root.right != null)
            return root.val == root.left.val && root.val == root.right.val && isUnivalTree(root.left) && isUnivalTree(root.right) ;

        if(root.right != null)
            return root.val == root.right.val && isUnivalTree(root.right) ;

        if(root.left != null)
            return root.val == root.left.val && isUnivalTree(root.left);

        // a leaf
        return true;
    }
}
