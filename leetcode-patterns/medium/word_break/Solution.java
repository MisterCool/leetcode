package word_break;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// complexity is O(n^3)
public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s, wordDict, 0, new HashSet<>());
    }

    public boolean dfs(String s, List<String> wordDict, int index, Set<String> checked) {
        if (s.isEmpty()) {
            return true;
        }

        if (checked.contains(s)) {
            return false;
        }

        checked.add(s);

        for (int i = index; i < wordDict.size(); i++) {
            if (s.startsWith(wordDict.get(i)) && dfs(s.substring(wordDict.get(i).length()), wordDict, index, checked)) {
                return true;
            }

        }
        return false;
    }
}
