package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.ListNode;
import shamrokh.muhammad.leetcode.datastructure.TreeNode;
import java.util.*;

class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> sortedValues = new ArrayList<>();

        // creating a sorted list from root tree (inorder recursive scan)
        inOrderScanTreeAndRetrieveValuesArray(root, sortedValues);

        // scanning over array elements to build requested TreeNode
        TreeNode result = new TreeNode(sortedValues.get(0));
        TreeNode scanner = result;
        for(int i=1;i<sortedValues.size();i++){
            scanner.right = new TreeNode(sortedValues.get(i));
            scanner = scanner.right;
        }

        return result;
    }

    private void inOrderScanTreeAndRetrieveValuesArray(TreeNode root, List<Integer> list) {
        if(root == null)
            return;

        inOrderScanTreeAndRetrieveValuesArray(root.left, list);
        list.add(root.val);
        inOrderScanTreeAndRetrieveValuesArray(root.right, list);
    }
}