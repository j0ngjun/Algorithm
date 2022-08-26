package LeetCode.L20220826;

public class P3_35 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        /* nums = [1, 3, 5, 6], target = 2
        * i = 0; start = 0, end = 3, mid = 1, nums[mid] = 3
        * i = 1; start = 0, end = 0, mid = 0, nums[mid] = 1
        * i = 2; start = mid + 1 -> start == end -> return start
        * */
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            if(target > nums[mid]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return start;
    }
}
