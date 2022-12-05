package diameter_of_binary_tree;

import common.TreeNode;

// https://leetcode.com/problems/diameter-of-binary-tree/
public class Main {

    public static void main(String[] args) {

        TreeNode treeNode =
            new TreeNode(1,
                new TreeNode(2, new TreeNode(4, new TreeNode(6), null), new TreeNode(5, null, new TreeNode(8))),
        new TreeNode(3));

        System.out.println(new Solution().diameterOfBinaryTree1(treeNode));
    }
}
