package longest_palindromic_substring;

// https://leetcode.com/problems/longest-palindromic-substring/solutions/1338509/python-two-pointer-easy2understand-solution/
// we will consider each character of the string as center and try to expand it if its pallindromic property exists.
public class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        String result = "";
        for(int i = 0; i < s.length(); i++) {
            String str = getStreakPalindrome(s, i - 1, i + 1);
            if(str.length() > maxLength){
                result = str;
                maxLength = str.length();
            }

        }

        for(int i = 0; i < s.length(); i++) {
            String str = getStreakPalindrome(s, i, i + 1);
            if(str.length() > maxLength){
                result = str;
                maxLength = str.length();
            }

        }

        return result;
    }

    private String getStreakPalindrome(String s, int start, int end) {
        while(start >= 0 && end < s.length()) {
            if(s.charAt(start) != s.charAt(end)) break;
            start--;
            end++;
        }

        return s.substring(start + 1, end);
    }
}
