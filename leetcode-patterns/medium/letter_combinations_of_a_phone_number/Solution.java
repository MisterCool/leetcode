package letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        String[] letters = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        backtrack(0, letters, digits, result, new StringBuilder());

        return result;
    }

    private void backtrack(int index, String[] letters, String digits, List<String> result, StringBuilder str) {
        if (digits.length() == str.length()) {
            result.add(str.toString());
            return;
        }

        char[] letterArr = letters[digits.charAt(index) - '2'].toCharArray();

        for (int i = 0; i < letterArr.length; i++) {
            str.append(letterArr[i]);
            backtrack(index + 1, letters, digits, result, str);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
