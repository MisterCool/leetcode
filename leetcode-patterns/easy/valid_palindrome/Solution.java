package valid_palindrome;

public class Solution {

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] chars = s.toCharArray();

        while(start < end) {
            if(!Character.isLetter(chars[start]) && !Character.isDigit(chars[start])) {
                start++;
                continue;
            }
            if(!Character.isLetter(chars[end]) && !Character.isDigit(chars[end])){
                end--;
                continue;
            }

            if(Character.toLowerCase(chars[start]) != Character.toLowerCase(chars[end])){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
