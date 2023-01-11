package palindrome_partitioning;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<String>> partition(String s) {
        List<String> list = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();

        backtrack(s, list, result);

        return result;
    }

    private void backtrack(String s, List<String> list, List<List<String>> result) {
        if (s.length() == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 1; i <= s.length(); i++) {
            String substring = s.substring(0, i);
            if (isPalindrome(substring)) {
                list.add(substring);
                backtrack(s.substring(i), list, result);
                list.remove(list.size() - 1);
            }

        }
    }

    private boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);

        return s.equals(stringBuilder.reverse().toString());
    }
}
