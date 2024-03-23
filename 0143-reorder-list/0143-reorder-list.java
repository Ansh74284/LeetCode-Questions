/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public ListNode reverseList(ListNode head) {
    	if (head == null || head.next == null) return head; // base case
    	ListNode pre = null, cur = head;
    	while (cur != null) {
    		ListNode temp = cur.next;
    		cur.next = pre;
    		pre = cur;
    		cur = temp;
    	}
    	return pre;
    }
    public void reorderList(ListNode head) {
       
        if(head == null || head.next == null) return; // base case
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next  != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        ListNode tail = reverseList(mid);
        ListNode cur = head;
        while(tail != null ){
            ListNode temp = cur.next;
            cur.next = tail;
            tail = tail.next;
            cur.next.next = temp;
            cur = temp;
        }
    }
}