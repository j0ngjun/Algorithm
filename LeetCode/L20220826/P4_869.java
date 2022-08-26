package LeetCode.L20220826;

import java.util.Arrays;

public class P4_869 {
    class Solution {
        public boolean reorderedPowerOf2(int n) {
            // 입력 받은 숫자 정렬
            char[] number = sortedDigits(n);

            // 10의 9승까지가 조건이라 2의 29승까지만 계산
            for (int i = 0; i < 30; ++i) {
                // 2의 제곱수를 이진법으로 바꾸면
                // 1 -> 1, 2 -> 10, 4 -> 100, 8 -> 1000 ... 0이 뒤에 하나씩 추가
                char[] powerOfTwo = sortedDigits(1 << i);

                // 문자 배열끼리 비교 -> 같으면 true 반환
                if (Arrays.equals(number, powerOfTwo))
                    return true;
            }
            return false;
        }

        // 정수를 자리별 오름차순정렬해주고 문자 배열로 return
        private char[] sortedDigits(int n) {
            char[] digits = String.valueOf(n).toCharArray();
            Arrays.sort(digits);
            return digits;
        }
    }
}
