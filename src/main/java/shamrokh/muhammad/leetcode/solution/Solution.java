package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.TreeNode;


class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        // we received one Node tree, target is root
        if(cloned.left == null && cloned.right == null)
            return cloned;

        return findTargetCopy(cloned, target);
    }

    private TreeNode findTargetCopy(TreeNode cloned, TreeNode target) {
        if(cloned == null)
            return null;

        // equal values, checking if same tree (which mean same node since it is a clone)
        if(cloned.val == target.val && similarTrees(cloned, target))
            return cloned;

        //  the node in left subtree
        TreeNode left = findTargetCopy(cloned.left, target);
        if(left != null)
            return left;

        // searching node in right subtree
        return findTargetCopy(cloned.right,target);

    }

    private boolean similarTrees(TreeNode cloned, TreeNode target) {
        //both roots are null
        if(cloned == null && target == null)
            return true;

        // at least one of the roots is not root
        if(cloned == null || target == null)
            return false;

        // recursively checking if both trees are equal
        return cloned.val == target.val &&
                similarTrees(cloned.left,target.left) &&
                similarTrees(cloned.right, target.right);
    }
}
