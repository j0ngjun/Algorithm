package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class L20220825_1684 {
    // allowed에 포함된 문자로 이루어져있는 words의 갯수 반환
    class Solution {
        public int countConsistentStrings(String allowed, String[] words) {
            Map<Character, Integer> map = new HashMap<>();
            int count = 0;

            // map에 allowed 문자 하나씩을 key로 넣어줌
            for(int i = 0; i < allowed.length(); i++) {
                map.put(allowed.charAt(i), 0);
            }

            // words를 한 문자씩 반복하며 맵에 포함되어 있지 않을 경우 false flag 반환
            // true flag 반환 시에만 count 변수 +1해주고 끝까지 돈 후 count 반환
            for(int i = 0; i < words.length; i++) {
                boolean flag = true;

                for(int j = 0; j < words[i].length(); j++) {
                    if(!map.containsKey(words[i].charAt(j))) {
                        flag = false;
                        break;
                    }
                }

                if(flag)
                    count++;
            }

            return count;
        }
    }
}
