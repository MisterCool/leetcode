package invert_binary_tree;

import common.TreeNode;
// https://leetcode.com/problems/invert-binary-tree/
public class Main {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)),
            new TreeNode(7, new TreeNode(6), new TreeNode(9)));

        TreeNode treeNode1 = Solution.invertTree(treeNode);

        System.out.println(treeNode1);
    }
}
