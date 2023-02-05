package permutation_in_string;

import java.util.HashMap;
import java.util.Map;


// the main idea is using sliding window and saving frequency in map
public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> mapPermutation = new HashMap<>();

        for(int i = 0; i < s1.length(); i++) {
            mapPermutation.put(s1.charAt(i), mapPermutation.getOrDefault(s1.charAt(i), 0) + 1);
        }

        Map<Character, Integer> mapS2 = new HashMap<>();
        int windowStart = 0;

        for(int windowEnd = 0; windowEnd < s2.length(); windowEnd++) {

            mapS2.put(s2.charAt(windowEnd), mapS2.getOrDefault(s2.charAt(windowEnd), 0) + 1);

            if(s1.length() == windowEnd - windowStart + 1) {
                if(mapPermutation.equals(mapS2)) return true;
                else {
                    mapS2.put(s2.charAt(windowStart), mapS2.get(s2.charAt(windowStart)) - 1);
                    if(mapS2.get(s2.charAt(windowStart)) == 0) {
                        mapS2.remove(s2.charAt(windowStart));
                    }
                    windowStart++;
                }
            }
        }

        return false;
    }
}
