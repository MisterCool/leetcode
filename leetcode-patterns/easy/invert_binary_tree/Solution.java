package invert_binary_tree;

import common.TreeNode;

public class Solution {

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;

        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        return root;
    }
}
