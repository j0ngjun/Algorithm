package LeetCode.L20220829;

public class P3_557 {
    class Solution {
        public String reverseWords(String s) {
            String[] spt = s.split(" ");
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < spt.length; i++) {
                for(int j = spt[i].length() - 1; j >= 0; j--) {
                    sb.append(spt[i].charAt(j));
                }

                if(i != spt.length - 1) {
                    sb.append(" ");
                }
            }

            return sb.toString();
        }
    }
}
