package average_of_levels_in_binary_tree;

import common.TreeNode;

// https://leetcode.com/problems/average-of-levels-in-binary-tree/
public class Main {

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(3, new TreeNode(9, null, null),
            new TreeNode(20, new TreeNode(15, null,null), new TreeNode(7, null, null)));

        System.out.println(Solution.averageOfLevels(treeNode));

    }
}
