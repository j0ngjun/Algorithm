package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class L20220823_1313 {
    class Solution {
        public int[] decompressRLElist(int[] nums) {
            List<Integer> list = new ArrayList<>();

            // nums의 홀수 인덱스 수(nums[i+1])를 짝수 인덱스 수(nums[i]) 만큼 list에 넣어준다.
            for(int i = 0; i < nums.length; i+=2) {
                for(int j = 0; j < nums[i]; j++)
                    list.add(nums[i+1]);
            }

            // list의 크기 만큼 배열 선언 후 차례로 담아서 반환
            int[] answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}
