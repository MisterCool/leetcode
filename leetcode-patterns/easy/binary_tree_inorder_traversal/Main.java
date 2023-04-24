package binary_tree_inorder_traversal;

import common.TreeNode;

// https://leetcode.com/problems/binary-tree-inorder-traversal/
public class Main {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        System.out.println(new Solution().inorderTraversal(root));
    }
}
