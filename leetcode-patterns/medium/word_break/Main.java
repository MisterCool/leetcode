package word_break;

import java.util.List;

// https://leetcode.com/problems/word-break/description/
public class Main {
    public static void main(String[] args) {

        System.out.println(new Solution().wordBreak("catsandog", List.of("cats","dog","sand","and","cat")));
    }
}
