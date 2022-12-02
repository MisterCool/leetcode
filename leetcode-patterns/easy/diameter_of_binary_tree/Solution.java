package diameter_of_binary_tree;

import common.TreeNode;
// https://leetcode.com/problems/diameter-of-binary-tree/discuss/1283084/Simple-To-Under-stand-and-Implement-with-explanatation
public class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return maxDepth(root);
    }

    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        int diamThroughRoot = left + right;
        int diamLeft = maxDepth(root.left);
        int diamRight = maxDepth(root.right);
        return Math.max(diamRight, Math.max(diamThroughRoot, diamLeft));
    }

    private int getDepth(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(getDepth(root.left), getDepth(root.right));
    }
}
