package longest_increasing_subsequence;

// https://leetcode.com/problems/longest-increasing-subsequence/description/
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLIS(new int[]{10, 3, 7, 5}));
        System.out.println(new Solution().lengthOfLISBruteForce(new int[]{10, 3, 7, 5}));
    }
}
