package longest_substring_with_at_most_k_distinct_characters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> charByFreq = new HashMap<>();
        int windowStart = 0;
        int maxLength = 0;
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            if(charByFreq.containsKey(s.charAt(windowEnd))) {
                charByFreq.put(s.charAt(windowEnd), charByFreq.get(s.charAt(windowEnd)) + 1);
            }
            else {
                charByFreq.put(s.charAt(windowEnd), 1);
            }

            while (charByFreq.keySet().size() > k) {
                charByFreq.put(s.charAt(windowStart), charByFreq.get(s.charAt(windowStart)) - 1);
                if(charByFreq.get(s.charAt(windowStart)) == 0) charByFreq.remove((s.charAt(windowStart)));
                windowStart++;
            }
            maxLength = Math.max(maxLength, charByFreq.values().stream().mapToInt(t -> t).sum());
        }

        return maxLength;
    }
}
