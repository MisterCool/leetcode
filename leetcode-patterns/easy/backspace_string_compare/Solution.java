package backspace_string_compare;

import java.util.Stack;

public class Solution {

    // space O(n)
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        int pointS = 0;
        int pointT = 0;

        while (pointS != s.length()) {

            if (s.toCharArray()[pointS] != '#') {
                stackS.push(s.toCharArray()[pointS]);
            } else if (!stackS.isEmpty())
                stackS.pop();

            pointS++;
        }

        while (pointT != t.length()) {

            if (t.toCharArray()[pointT] != '#') {
                stackT.push(t.toCharArray()[pointT]);
            } else if (!stackT.isEmpty()) stackT.pop();
            pointT++;
        }

        return stackS.equals(stackT);
    }

    // space O(1)
    public static boolean backspaceCompareOptimal(String s, String t) {
        // Start from the last index of each string, and move index backwards.
        int sIndex = s.length() - 1;
        int tIndex = t.length() - 1;
        boolean result = true;
        while (sIndex >= 0 || tIndex >= 0)// As long as there're values in one of the strings.
        {
            // Get the next valid chars for both strings.
            int sNextValidCharIndex = getNextValidCharIndex(s, sIndex);
            int tNextValidCharIndex = getNextValidCharIndex(t, tIndex);

            // If the next valid char indices of both strings are valid, but the value doesn't equal each other. Those 2 strings are not the same.
            if (sNextValidCharIndex >= 0 && tNextValidCharIndex >= 0 && s.charAt(sNextValidCharIndex) != t.charAt(tNextValidCharIndex))
                return false;

            // If one of the string is empty and the other is not, they are not the same.
            if ((sNextValidCharIndex < 0 && tNextValidCharIndex >=0)
                || (tNextValidCharIndex < 0 && sNextValidCharIndex >=0))
                return false;

            // If none of the strings has values, they are the same.
            if (sNextValidCharIndex < 0 && tNextValidCharIndex < 0)
                return true;

            // Compare the next valid chars from both strings.
            sIndex = sNextValidCharIndex - 1;
            tIndex = tNextValidCharIndex - 1;
        }
        return result;
    }

    // This method finds the next valid char from parameter index backwards.
    public static int getNextValidCharIndex(String str, int index)
    {
        int backspaceCount = 0;
        while (index >= 0)
        {
            char charOfIndex = str.charAt(index);
            if (charOfIndex == '#')// This char is #.
            {
                backspaceCount ++;// Increse the # count.
                index--;// Move the index to the next one.
            }
            else // This char is a regular char.
            {
                if (backspaceCount == 0) // When there's no # accumulated.
                    return index; // This index is the result.
                else if (backspaceCount > 0) // When there're #.
                {
                    backspaceCount --; // Reduce the # count.
                    index--; // Move the index to the next one.
                }
            }
        }
        return index;
    }
}
