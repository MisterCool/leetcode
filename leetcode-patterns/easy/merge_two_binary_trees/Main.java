package merge_two_binary_trees;

import common.TreeNode;

// https://leetcode.com/problems/merge-two-binary-trees/
public class Main {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1, new TreeNode(3, new TreeNode(5, null, null), null),
            null);

        TreeNode treeNode2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4, null, null)),
            new TreeNode(100, null, new TreeNode(7)));


        System.out.println(Solution.mergeTrees(treeNode1, treeNode2));
    }
}
