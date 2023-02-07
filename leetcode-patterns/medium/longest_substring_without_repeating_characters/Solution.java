package longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/solutions/1713602/simple-java-solution-sliding-window/
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        String str = "";
        int windowStart = 0;
        int maxLength = 0;

        for(int endWindow = 0; endWindow < s.length(); endWindow++) {
            map.put(s.charAt(endWindow), map.getOrDefault(s.charAt(endWindow), 0) + 1);
            str+=s.charAt(endWindow);

            if(map.keySet().size() != str.length()) {
                maxLength = Math.max(maxLength, map.keySet().size());
                str = str.substring(1);
                map.put(s.charAt(windowStart), map.get(s.charAt(windowStart)) - 1);
                if(map.get(s.charAt(windowStart)) == 0) {
                    map.remove(s.charAt(windowStart));
                }
                windowStart++;
            } else {
                maxLength = Math.max(maxLength, map.keySet().size());
            }
        }
        return maxLength;
    }

    // more simple using set
    public int lengthOfLongestSubstring1(String s) {
        Set<Character> set = new HashSet<>();
        int windowStart = 0;
        int maxLength = 0;

        for(int endWindow = 0; endWindow < s.length(); endWindow++) {

            while (set.contains(s.charAt(endWindow))){
                set.remove(s.charAt(windowStart));
                windowStart++;
            }
            set.add(s.charAt(endWindow));
            maxLength = Math.max(maxLength, endWindow - windowStart + 1);
        }
        return maxLength;
    }
}
