package minimum_depth_of_binary_tree;

import common.TreeNode;

// https://leetcode.com/problems/minimum-depth-of-binary-tree/
public class Main {

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(3, new TreeNode(9, null, null),
            new TreeNode(20, new TreeNode(15, null,null), new TreeNode(7, null, null)));


        TreeNode treeNode1 = new TreeNode(2, null, new TreeNode(3, null,
            new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6, null, null)))));

//        System.out.println(Solution.minDepth(treeNode));
        System.out.println(Solution.minDepth(treeNode1));

    }
}
