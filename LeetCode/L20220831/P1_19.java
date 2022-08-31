package LeetCode.L20220831;

public class P1_19 {
    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head == null) return null;

            ListNode ref = head;
            ListNode main = head;
            int count = 0;

            while(count < n) {
                ref = ref.next;
                count++;
            }

            if(ref == null) return head.next;

            while(ref.next != null) {
                ref = ref.next;
                main = main.next;
            }

            main.next = main.next.next;
            return head;
        }
    }
}
