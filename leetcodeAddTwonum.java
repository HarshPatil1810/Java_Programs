class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);  // Dummy node
        ListNode current = dummy;  
        int carry = 0;
        
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;  // Start with the carry value

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;  // Update carry for next iteration
            current.next = new ListNode(sum % 10);  // Store last digit
            current = current.next;
        }
        return dummy.next;  // Skip the dummy node
    }
}
