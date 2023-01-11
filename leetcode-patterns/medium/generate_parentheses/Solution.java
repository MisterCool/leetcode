package generate_parentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        backtrack(0, 0, result, "", n);

        return result;

    }

    private void backtrack(int usedOpenedBrackets, int usedClosedBrackets, List<String> result, String str, int n) {
        if (usedClosedBrackets == n && usedOpenedBrackets == n) {
            result.add(str);
            return;
        }

        if (usedOpenedBrackets < n) {
            str += "(";
            backtrack(usedOpenedBrackets + 1, usedClosedBrackets, result, str, n);
        }

        if(usedClosedBrackets < usedOpenedBrackets) {
            str += ")";
            backtrack(usedOpenedBrackets, usedClosedBrackets + 1, result, str, n);
        }
    }

}

