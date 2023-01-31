package maximum_product_subarray;

// https://leetcode.com/problems/maximum-product-subarray/solutions/203013/c-o-n-time-o-1-space-solution-with-explanation/
public class Solution {

    public int maxProduct(int[] nums) {
        int best = Integer.MIN_VALUE;
        int minProd = 1;
        int maxProd = 1;
        for (int n : nums) {
            if (n < 0) {
                int temp = minProd;
                minProd = maxProd;
                maxProd = temp;
            }
            maxProd = Math.max(n * maxProd, n);
            minProd = Math.min(n * minProd, n);

            best = Math.max(best, maxProd);
        }
        return best;
    }


    public int maxProductWithoutNegative(int[] nums) {
        int best = Integer.MIN_VALUE;
        int runningProduct = 1;
        for (int n : nums) {
            // Pick the larger of current number and the result of the multiplication
            // Picking n means we start considering a new sub-array
            runningProduct = Math.max(runningProduct * n, n);
            // Keep track of the max runningProduct that we find
            best = Math.max(runningProduct, best);
        }
        return best;
    }
}
