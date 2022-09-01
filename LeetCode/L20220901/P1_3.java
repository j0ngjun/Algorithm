package LeetCode.L20220901;

import java.util.HashSet;

public class P1_3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> set = new HashSet<>();
            int left = 0;
            int right = 0;
            int max = 0;

            while(right < s.length()) {
                char c = s.charAt(right);
                if(!set.contains(c)) {
                    set.add(c);
                    right++;
                    max = Math.max(max, set.size());
                }else {
                    set.remove(s.charAt(left));
                    left++;
                }
            }

            return max;
        }
    }
}
