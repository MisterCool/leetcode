package palindrome_number;

class Solution {
    public boolean isPalindrome(int x) {
        int input = x;
        int reverseX = 0;
        while(x > 0) {
            reverseX = x % 10 + reverseX * 10;
            x = x / 10;
        }

        return reverseX == input;
    }
}
