package LeetCode.L20220829;

public class P2_344 {
    class Solution {
        public void reverseString(char[] s) {
            for(int i = 0; i < s.length / 2; i++) {
                char temp = ' ';

                temp = s[i];
                s[i] = s[s.length - i - 1];
                s[s.length - i - 1] = temp;
            }
        }
    }
}
