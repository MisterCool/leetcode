package letter_case_permutation;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/letter-case-permutation/solutions/115485/Java-Easy-BFS-DFS-solution-with-explanation/
//     a   A
//  ab aB Ab AB
public class Solution {

    public static List<String> letterCasePermutation(String s) {
        if (s == null) {
            return new LinkedList<>();
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(s);

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) continue;
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String cur = queue.poll();
                char[] chs = cur.toCharArray();

                chs[i] = Character.toUpperCase(chs[i]);
                queue.offer(String.valueOf(chs));

                chs[i] = Character.toLowerCase(chs[i]);
                queue.offer(String.valueOf(chs));
            }
        }

        return new LinkedList<>(queue);
    }
}
