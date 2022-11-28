package same_tree;

import common.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

// https://leetcode.com/problems/same-tree/
public class Solution {

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;
        if(p != null && q == null) return false;
        if(p == null && q != null) return false;

        Queue<TreeNode> firstQueue = new ArrayDeque<>();
        firstQueue.add(p);

        Queue<TreeNode> secondQueue = new ArrayDeque<>();

        secondQueue.add(q);

        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            TreeNode firstPoll = firstQueue.poll();
            TreeNode secondPoll = secondQueue.poll();

            if (firstPoll.val != secondPoll.val) {
                return false;
            }

            if (firstPoll.left == null && secondPoll.left != null) return false;
            if (firstPoll.left != null && secondPoll.left == null) return false;

            if (firstPoll.right == null && secondPoll.right != null) return false;
            if (firstPoll.right != null && secondPoll.right == null) return false;

            if (firstPoll.left != null) firstQueue.add(firstPoll.left);
            if (firstPoll.right != null) firstQueue.add(firstPoll.right);

            if (secondPoll.left != null) secondQueue.add(secondPoll.left);
            if (secondPoll.right != null) secondQueue.add(secondPoll.right);

        }
        return true;
    }

    public boolean isSameTreeRec(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSameTreeRec(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
