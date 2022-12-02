package path_sum;

import common.TreeNode;

// https://leetcode.com/problems/path-sum/
public class Main {

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(5,
            new TreeNode(4, new TreeNode(11, new TreeNode(7, null, null), new TreeNode(2, null, null)), null),
            new TreeNode(8, new TreeNode(13, null, null), new TreeNode(4,null, new TreeNode(1, null,null))));

        System.out.println(Solution.hasPathSumRec(treeNode, 22));


    }
}
