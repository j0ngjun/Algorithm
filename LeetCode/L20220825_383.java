package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class L20220825_383 {
    // magazine에 포함되어 있는 문자로 ransomNote의 문장을 만들 수 있는지
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            Map<Character, Integer> map = new HashMap<>();

            // map에 magazine을 구성하고 있는 문자 갯수를 (문자, 갯수)로 put
            for(int i = 0; i < magazine.length(); i++) {
                char ch = magazine.charAt(i);
                if(!map.containsKey(ch))
                    map.put(ch, 1);
                else
                    map.put(ch, map.get(ch) + 1);
            }

            // ransomNote을 구성하고 있는 문자를 순서대로 돌며
            // map에 존재하지 않을 경우, map에서 해당 문자의 갯수가 0이 됐을 경우, false 반환
            // map에 있고 갯수가 0이 아닐 경우 갯수 -1 처리 후 반복
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
