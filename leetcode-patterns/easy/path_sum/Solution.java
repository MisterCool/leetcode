package path_sum;

import common.TreeNode;

import java.util.Stack;

// the main idea do one more stack which will save treeNode value
public class Solution {

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> integerStack = new Stack<>();
        stack.add(root);
        integerStack.add(root.val);
        while (!stack.isEmpty()) {

            TreeNode poll = stack.pop();
            Integer pop = integerStack.pop();

            if (poll.left == null && poll.right == null && pop == targetSum) return true;
            if (poll.left != null) {
                stack.add(poll.left);
                integerStack.add(poll.left.val + pop);
            }
            if (poll.right != null) {
                stack.add(poll.right);
                integerStack.add(poll.right.val + pop);
            }
        }

        return false;
    }

    public static boolean hasPathSumRec(TreeNode root, int targetSum) {
        if (root == null) return false;
        targetSum -= root.val;
        if(root.left==null && root.right==null){
            return targetSum == 0;
        }
        return hasPathSumRec(root.left, targetSum) || hasPathSumRec(root.right, targetSum);
    }
}
