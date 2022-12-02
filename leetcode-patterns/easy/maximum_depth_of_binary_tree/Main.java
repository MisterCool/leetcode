package maximum_depth_of_binary_tree;

import common.TreeNode;

import static maximum_depth_of_binary_tree.Solution.maxDepthDfs;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class Main {

    public static void main(String[] args) {

//        TreeNode treeNode = new TreeNode(3, new TreeNode(9, null, null),
//            new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));

        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)),
            new TreeNode(3));

        System.out.println(maxDepthDfs(treeNode.left));
        System.out.println(maxDepthDfs(treeNode.right));
    }
}
