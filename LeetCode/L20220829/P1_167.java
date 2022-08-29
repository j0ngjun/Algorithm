package LeetCode.L20220829;

public class P1_167 {
    // 투포인터 문제
    // 일반적인 for문을 돌지 않고 while문을 이용하여 문제 해결
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int[] answer = new int[2];

            int i = 0;
            int j = numbers.length - 1;

            while(i < j) {
                if(numbers[i] + numbers[j] == target) {
                    answer[0] = i + 1;
                    answer[1] = j + 1;
                    return answer;
                }else if(numbers[i] + numbers[j] < target) {
                    i++;
                }else {
                    j--;
                }
            }

            return answer;
        }
    }
}
