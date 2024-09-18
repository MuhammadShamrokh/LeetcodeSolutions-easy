package shamrokh.muhammad.leetcode.solution;

import shamrokh.muhammad.leetcode.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private class Pair{
        int depth;
        int parent;

        public Pair(int depth, int parent) {
            this.depth = depth;
            this.parent = parent;
        }
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        List<Pair> nodesInformation = new ArrayList<>(2);

        findNodesDetailsRecursive(root, x, y, nodesInformation, root, 0);

        return nodesInformation.get(0).depth == nodesInformation.get(1).depth
                && nodesInformation.get(0).parent != nodesInformation.get(1).parent;
    }

    private void findNodesDetailsRecursive(TreeNode root, int x, int y, List<Pair> nodesInformation, TreeNode parent, int depth) {
        if(root == null)
            return;

        // x and y nodes were already found, we stop the recursive function
        if(nodesInformation.size() == 2)
            return;

        if(root.val == x || root.val == y){
            nodesInformation.add(new Pair(depth, parent.val));
        }

        findNodesDetailsRecursive(root.left, x, y, nodesInformation, root, depth+1);
        findNodesDetailsRecursive(root.right, x, y, nodesInformation, root, depth+1);
    }
}