package LeetCode;

public class L20220824_189 {
    // 주어진 k값 만큼 행렬 미루기
    class Solution {
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            k %= n;
            // 배열길이-k 부터 마지막 인덱스까지 자리 뒤집음
            reverse(nums, n - k, n - 1);
            // 처음부터 마지막까지 전체 자리 뒤집음
            reverse(nums, 0, n - 1);
            // k부터 마지막 인덱스까지 자리 뒤집음
            reverse(nums, k, n - 1);
        }

        // 자리 뒤집기 함수
        public void reverse(int nums[], int l, int r) {
            // r-l이 홀수일 경우 => 총 길이 짝수의 자리를 뒤집는다 => 전체 모두 뒤집기 => (r-l+1)/2번 만큼 반복
            // r-l이 짝수일 경우 => 총 길이 홀수의 자리를 뒤집는다 => 가운데 값은 제외하고 뒤집기 => 사실상 (r-l)/2번 만큼 반복
            // 짝수일 경우 (짝수+1)/2나 짝수/2나 결과가 같다.
            for(int i = 0; i < (r-l+1) / 2; i++) {
                int temp = nums[l+i];
                nums[l+i] = nums[r-i];
                nums[r-i] = temp;
            }
        }

        /* 뒤집는 순서 참고
            init nums 1 2 3 4 5 6 7
            4 6  nums 1 2 3 4 7 6 5
            0 6  nums 5 6 7 4 3 2 1
            3 6  nums 5 6 7 1 2 3 4

            init nums -1 -100 3 99
            2 3  nums -1 -100 99 3
            0 3  nums 3 99 -100 -1
            2 3  nums 3 99 -1 -100
        */
    }
}
