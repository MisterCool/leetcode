package rotate_string;

import java.util.LinkedList;

public class Solution {

    public boolean rotateString(String s, String goal) {
        char[] sCharArray = s.toCharArray();
        for(int i = 0; i < sCharArray.length - 1; i++){
            String newString = sCharArray[i] + s.substring(i + 1, s.length());
            if(newString.equals(goal)) return true;
        }

        return false;

    }

    // perfect solution
    public boolean rotateString1(String s, String goal) {
        return s.length() == goal.length() && (s+s).contains(goal);
    }
}
