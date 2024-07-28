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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

         ListNode current = head;
        int length = 1;  // At least one node is there in the list
        while (current.next != null) {
            current = current.next;
            length++;
        }

        current.next = head;

        k = k % length;
        int stepsToNewHead = length - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }

        // The new head is the node after the new tail
        ListNode newHead = newTail.next;

        // Break the circular list to form the new list
        newTail.next = null;

        return newHead;

    }
}