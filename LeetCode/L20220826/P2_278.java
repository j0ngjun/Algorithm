package LeetCode.L20220826;

public class P2_278 {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    /*public class Solution extends VersionControl {
        // 이진 탐색 활용
        public int firstBadVersion(int n) {
            int start = 1;
            int end = n;

            while(start < end) {
                int mid = start + (end - start) / 2;
                if(isBadVersion(mid)) {
                    end = mid;
                }else {
                    start = mid + 1;
                }
            }
            
            return start;
        }
    }*/
}
