package LeetCode;

import java.util.Stack;

public class L20220823_234 {
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
        public boolean isPalindrome(ListNode head) {
            // 초기 연결리스트 설정
            ListNode current = head;
            
            Stack<Integer> stack = new Stack<>();
            // 현재 연결리스트가 NULL일 때까지 반복
            while(current != null){
                // 스택에 현재 값 넣어주고,
                stack.push(current.val);
                // 현재 노드를 다음 노드로 설정
                current = current.next;
            }

            // 다시 초기 연결리스트로 설정
            current = head;
            while(current != null){
                // 현재 값과 스택에 넣은 마지막 숫자 비교 후 다르면 false 반환
                // stack은 뒤에서부터, current는 앞에서부터 교차하여 비교한다고 생각하면 쉬움
                if (current.val != stack.pop())
                    return false;                
                current = current.next;
            }

            // 모두 같으면 true 반환
            return true;
        }
    }
}
