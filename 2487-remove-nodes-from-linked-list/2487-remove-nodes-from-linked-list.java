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
    public ListNode removeNodes(ListNode head) {
        if(head == null){
            return null;
        }
        //Reverse the linked list
        head = reverse(head);

        ListNode current = head;
        ListNode maxNode = head;

        while(current != null && current.next != null){
            if(current.next.val < maxNode.val) {
                current.next = current.next.next;
            } else{
                current = current.next;
                maxNode = current;
            }
        }
        //Reverse the Linked List again to get the correct order 
        return reverse(head);
    }

    //helper function to reverse a linked list
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

//head is given in the question in the Singly Linked List and we will remove the  the node which has a 
//greater one in the right and return that only in the output.

// Approach
// First, we reverse the linked list. Reversing the list allows us to traverse from right to left (i.e., from the end to the beginning) while maintaining a record of the maximum value encountered.

// We maintain two pointers: current and maximum. The current pointer iterates through the list, and the maximum pointer keeps track of the maximum value seen so far. At the beginning, both pointers point to the first node.

// While traversing the list from right to left, if the current node's value is greater than the maximum value, we remove the current node by adjusting the next pointer of the previous node (if exists) to skip the current node.

// If the current node's value is not greater than the maximum value, we update the maximum value to be the maximum of the current node's value and the previous maximum.

// After the entire pass, we reverse the list again to restore its original order.