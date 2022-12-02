package maximum_depth_of_binary_tree;

import common.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Solution {

    public static int maxDepthDfs(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> depths = new Stack<>();
        stack.push(root);
        depths.add(1);
        int result = 1;
        while (!stack.isEmpty()) {
            TreeNode currNode = stack.pop();
            Integer currDepth = depths.pop();

            if (currNode.left == null && currNode.right == null) {
                result = result > currDepth ? result : currDepth;
            }
            if (currNode.left != null) {
                stack.push(currNode.left);
                depths.push(currDepth + 1);
            }
            if (currNode.right != null) {
                stack.push(currNode.right);
                depths.push(currDepth + 1);
            }

        }
        return result;
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 1;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);
            }
            level++;

        }

        return level;
    }

    public static int maxDepthRec(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepthRec(root.left), maxDepthRec(root.right));
    }
}

