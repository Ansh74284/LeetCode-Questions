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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode r1 = l1;
        ListNode r2 = l2;
        int carry = 0;
        ListNode ans = null;
        ListNode temp = null;

        while(r1 != null || r2 != null || carry != 0) {
            int sum = carry;
            if(r1 != null){
                sum += r1.val;
                r1 = r1.next;
            }
            if(r2 != null) {
                sum += r2.val;
                r2 = r2.next;
            }
            int digit = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode (digit);
            if(ans == null) {
                ans = temp = newNode;
            }else{
                temp.next = newNode;
                temp = newNode;
            }
        }
        return ans;
     
    }
}