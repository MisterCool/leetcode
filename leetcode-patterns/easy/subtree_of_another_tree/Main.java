package subtree_of_another_tree;

import common.TreeNode;

// https://leetcode.com/problems/subtree-of-another-tree/
public class Main {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(3,
            new TreeNode(4, new TreeNode(1, null, null),
            new TreeNode(2, null, null)),
            new TreeNode(5));

        TreeNode treeNode2 = new TreeNode(4, new TreeNode(1), new TreeNode(2));


        System.out.println(Solution.isSubtree(treeNode1, treeNode2));
    }
}
