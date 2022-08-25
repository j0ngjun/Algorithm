package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class L20220825_383 {
    // magazine에 포함되어 있는 문자로 ransomNote의 문장을 만들 수 있는지
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            Map<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < magazine.length(); i++) {
                char ch = magazine.charAt(i);
                if(!map.containsKey(ch))
                    map.put(ch, 1);
                else
                    map.put(ch, map.get(ch) + 1);
            }

            for(int i = 0; i < ransomNote.length(); i++) {
                char ch = ransomNote.charAt(i);
                if(!map.containsKey(ch))
                    return false;
                else if(map.get(ch) == 0)
                    return false;
                else
                    map.put(ch, map.get(ch) - 1);
            }

            return true;
        }
    }
}
