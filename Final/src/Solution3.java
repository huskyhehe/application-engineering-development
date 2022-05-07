/**
 * Question 3:
 * Given a string s, find the length of the longest substring without repeating characters.
 */

import java.util.HashMap;

public class Solution3 {
     public int lengthOfLongestSubstring(String s) {
         if (s.length() == 0) return 0;

         HashMap<Character, Integer> map = new HashMap<>();
         int start = 0;
         int maxLen = 0;

         for (int i = 0; i < s.length(); i ++) {
             Character ch = s.charAt(i);
             if (map.containsKey(ch)) {
                 start = Math.max(start, map.get(ch) + 1);
             }
             map.put(ch, i);
             maxLen = Math.max(maxLen, i - start + 1);
         }
         return maxLen;
     }
}
