package longest_repeating_character_replacement;

import java.util.HashMap;
import java.util.Map;


// the main idea is find the most frequent char, and it turns out that
// windowSize - maxFreq is count of replaces needed to get a repeating sequence
public class Solution {

    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();

        int windowStart = 0;

        int maxLength = 0;
        int maxFreq = 0;
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char chr = s.charAt(windowEnd);

            freq.put(chr, freq.getOrDefault(chr, 0) + 1);

            maxFreq = Math.max(maxFreq, freq.get(chr));

            if(!(windowEnd - windowStart + 1 - maxFreq <= k)) {
                freq.put(s.charAt(windowStart), freq.get(s.charAt(windowStart)) - 1);
                windowStart++;
            }

            maxLength = windowEnd - windowStart + 1;
        }

        return maxLength;
    }
}
