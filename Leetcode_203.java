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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummay=new ListNode(0);
        dummay.next=head;
        ListNode temp=dummay;
        
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next; // Remove the node
            } else {
                temp = temp.next; // Move forward only if no deletion
            }
        }
        
        return dummay.next;
    }
}
