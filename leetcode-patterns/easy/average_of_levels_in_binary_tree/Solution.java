package average_of_levels_in_binary_tree;

import common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// The main idea is processed nodes on same level in one external iteration
public class Solution {

    public static List<Double> averageOfLevels(TreeNode root) {

        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Double> result = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0, count = size;

            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                sum += cur.val;

                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);
            }
            double avg = sum / count;
            result.add(avg);
        }

        return result;
    }
}
