package climbing_stairs;

// use fibonacci numbers
public class Solution {

    public static int climbStairs(int n) {
        if(n <= 2)
            return n;
        int n1 = 1;
        int n2 = 2;
        int result = 0;
        while (n - 2 != 0) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
            n--;
        }

        return result;
    }
}
