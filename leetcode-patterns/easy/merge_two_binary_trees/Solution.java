package merge_two_binary_trees;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        Queue<TreeNode[]> queue = new LinkedList<>();
        queue.add(new TreeNode[]{root1, root2});

        while (!queue.isEmpty()) {
            TreeNode[] treeNodes = queue.poll();

            if (treeNodes[1] == null) continue;

            treeNodes[0].val += treeNodes[1].val;

            if (treeNodes[0].left == null) {
                treeNodes[0].left = treeNodes[1].left;
            } else {
                queue.add(new TreeNode[] {treeNodes[0].left, treeNodes[1].left});
            }

            if (treeNodes[0].right == null) {
                treeNodes[0].right = treeNodes[1].right;
            } else {
                queue.add(new TreeNode[] {treeNodes[0].right, treeNodes[1].right});
            }
        }

        return root1;
    }

    public static TreeNode mergeTreesRec(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        root1.val += root2.val;

        root1.left = mergeTreesRec(root1.left, root2.left);
        root1.right = mergeTreesRec(root1.right, root2.right);

        return root1;
    }
}
