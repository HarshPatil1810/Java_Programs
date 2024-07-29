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
    public ListNode partition(ListNode head, int x) {
        ListNode lessHead = new ListNode(0);
        ListNode greaterHead = new ListNode(0);
        
        // Pointers to the current node in the less and greater lists
        ListNode less = lessHead;
        ListNode greater = greaterHead;
        
        // Iterate through the original list
        while (head != null) {
            if (head.val < x) {
                less.next = head;
                less = less.next;
            } else {
                greater.next = head;
                greater = greater.next;
            }
            head = head.next;
    }
    less.next = greaterHead.next;
        // Terminate the greater list
        greater.next = null;
        
        // The head of the new list is the next node after the dummy node
        return lessHead.next;
}
}