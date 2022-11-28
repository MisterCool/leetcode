package minimum_depth_of_binary_tree;

import common.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {

    public static int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.add(root);
        int depth = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();

                if(poll.left == null && poll.right == null){
                    return depth;
                }
                if (poll.left != null) queue.add(poll.left);
                if (poll.right != null) queue.add(poll.right);
            }
            depth++;
        }

        return depth;
    }
}
