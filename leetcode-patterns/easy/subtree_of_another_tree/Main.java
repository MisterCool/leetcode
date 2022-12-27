package subtree_of_another_tree;

import common.TreeNode;

// https://leetcode.com/problems/subtree-of-another-tree/
public class Main {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(3,
            new TreeNode(1, new TreeNode(5), new TreeNode(6, new TreeNode(7), new TreeNode(8))),
            new TreeNode(2, null, null));

        TreeNode treeNode2 = new TreeNode(6, new TreeNode(7), new TreeNode(8));


        System.out.println(Solution.isSubtree(treeNode1, treeNode2));
    }
}
