package same_tree;

import common.TreeNode;

import static same_tree.Solution.isSameTree;

public class Main {

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(3, new TreeNode(2, null, null), null);


        TreeNode treeNode1 = new TreeNode(3, null,  new TreeNode(2, null, null));


        System.out.println(isSameTree(treeNode, treeNode1));
    }
}
