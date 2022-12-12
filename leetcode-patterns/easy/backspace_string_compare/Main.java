package backspace_string_compare;

import static backspace_string_compare.Solution.backspaceCompare;
import static backspace_string_compare.Solution.backspaceCompareOptimal;

// https://leetcode.com/problems/backspace-string-compare/
public class Main {

    public static void main(String[] args) {
        String s = "ab##";
        String t = "c#d#";

        System.out.println(backspaceCompareOptimal(s, t));
    }
}
