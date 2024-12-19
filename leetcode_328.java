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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return head;

        ListNode prev=head, cur=head.next;
        ListNode head2=cur;
        int i=0;

        while(cur!=null && cur.next!=null){
            i++;
            prev.next=cur.next;
            prev=cur;
            cur=cur.next;
        }
        if(i%2==1){
            cur.next=head2;
            prev.next=null;
        }else
            prev.next=head2;

        return head;
    }
}
