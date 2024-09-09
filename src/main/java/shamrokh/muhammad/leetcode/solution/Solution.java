package shamrokh.muhammad.leetcode.solution;


import shamrokh.muhammad.leetcode.datastructure.TreeNode;

import java.util.*;

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> treeOneLeavesSequence = new LinkedList<>();
        List<Integer> treeTwoLeavesSequence = new LinkedList<>();

        // recursively build the leaves sequence lists
        getTreeLeavesSequenceListRecursive(root1, treeOneLeavesSequence);
        getTreeLeavesSequenceListRecursive(root2, treeTwoLeavesSequence);

        // return if sequences are equals or not
        return treeOneLeavesSequence.equals(treeTwoLeavesSequence);
    }

    private void getTreeLeavesSequenceListRecursive(TreeNode root, List<Integer> leavesSequencelist) {
        if(root == null)
            return;
        if(root.left == null && root.right == null) {
            leavesSequencelist.add(root.val);
            return;
        }


        // scan the tree (left child first then right one to build the leaves sequence list
        getTreeLeavesSequenceListRecursive(root.left, leavesSequencelist);
        getTreeLeavesSequenceListRecursive(root.right, leavesSequencelist);
    }
}