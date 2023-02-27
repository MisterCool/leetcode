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
}
